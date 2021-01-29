package com.example.ummahackathon.ui.Pendaftaran;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.ummahackathon.Model.PostDataPendaftaran;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;
import com.example.ummahackathon.ui.Detail.DetailUstadActivity;
import com.example.ummahackathon.ui.ReportPendaftaran.ReportPendaftaran;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FormPendaftaran extends AppCompatActivity {
    DatePickerDialog datePickerDialog;
    SimpleDateFormat simpleDateFormat;
    EditText edt_nama,edt_email,edt_nowa,edt_jeniskegiatan,edt_tema,edt_jumlahpeserta,edt_tglkegiatan,edt_durasi,edt_jam_mulai,edt_jam_selesai;
    ApiInterface apiInterface;
    Button btn_kirim_data,btn_batal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pendaftaran);
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        edt_nama = findViewById(R.id.editText_namaPengisiAcara);
        edt_email = findViewById(R.id.editText_Email);
        edt_nowa = findViewById(R.id.editText_no_handphone);
        edt_jeniskegiatan = findViewById(R.id.editText_jenis_kegiatan);
        edt_tema = findViewById(R.id.editText_tema);
        edt_jumlahpeserta = findViewById(R.id.editText_JlhPeserta);
        edt_tglkegiatan = findViewById(R.id.editText_TglKegiatan);
        edt_durasi = findViewById(R.id.editText_WktKegiatan);
        edt_jam_mulai = findViewById(R.id.editText_JamMulai);
        edt_jam_selesai = findViewById(R.id.editText_JamSelesai);
        btn_batal = findViewById(R.id.btn_batal);
        btn_kirim_data = findViewById(R.id.btn_kirim);
        edt_tglkegiatan.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });
        apiInterface = ApiClient.getClient("http://192.168.56.1/UmmaHackathonAPI/api/").create(ApiInterface.class);

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle getdata = getIntent().getExtras();
                Intent intent = new Intent(FormPendaftaran.this, DetailUstadActivity.class);
                intent.putExtra("id",getdata.getString("id"));
                startActivity(intent);
            }
        });
        btn_kirim_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_nama.getText().toString().length() == 0){
                    edt_nama.setError("Masukan Dengan Benar !");
                }if (edt_email.getText().toString().length() == 0){
                    edt_email.setError("Masukan Dengan Benar !");
                }if (edt_nowa.getText().toString().length() == 0){
                    edt_nowa.setError("Masukan Dengan Benar !");
                }if (edt_jeniskegiatan.getText().toString().length() == 0){
                    edt_jeniskegiatan.setError("Masukan Dengan Benar !");
                }if (edt_tema.getText().toString().length() == 0){
                    edt_tema.setError("Masukan Dengan Benar !");
                }if (edt_jumlahpeserta.getText().toString().length() == 0){
                    edt_jumlahpeserta.setError("Masukan Dengan Benar !");
                }if (edt_tglkegiatan.getText().toString().length() == 0){
                    edt_tglkegiatan.setError("Masukan Dengan Benar !");
                }if (edt_durasi.getText().toString().length() == 0){
                    edt_durasi.setError("Masukan Dengan Benar !");
                }if (edt_jam_mulai.getText().toString().length() == 0){
                    edt_jam_mulai.setError("Masukan Dengan Benar !");
                }if (edt_jam_selesai.getText().toString().length() == 0){
                    edt_jam_selesai.setError("Masukan Dengan Benar !");
                }else{

                    postdatatoapi(edt_nama.getText().toString(),edt_email.getText().toString(),
                            Integer.parseInt(edt_nowa.getText().toString()),edt_jeniskegiatan.getText().toString(),
                            edt_tema.getText().toString(),Integer.parseInt(edt_jumlahpeserta.getText().toString()),
                            edt_tglkegiatan.getText().toString(),edt_durasi.getText().toString(),edt_jam_mulai.getText().toString(),
                            edt_jam_selesai.getText().toString()
                    );
                }
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void showDateDialog(){
        Calendar calendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(FormPendaftaran.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                Calendar newdata = Calendar.getInstance();
                newdata.set(year,month,dayOfMonth);
                edt_tglkegiatan.setText(simpleDateFormat.format(newdata.getTime()));
            }
        },calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    public void postdatatoapi(String nama,String email,int no_wa,String jenis_kegiatan,String tema,int Jmlhpeserta, String tglKegiatan, String durasi,String jam_mulai,String jam_selesai){
        apiInterface.postDataPendaftaran(nama,email,no_wa,jenis_kegiatan,tema,Jmlhpeserta,tglKegiatan,durasi,jam_mulai,jam_selesai).enqueue(new Callback<PostDataPendaftaran>() {
            @Override
            public void onResponse(Call<PostDataPendaftaran> call, Response<PostDataPendaftaran> response) {
                if (response.isSuccessful()){
                    Intent intent = new Intent(FormPendaftaran.this, ReportPendaftaran.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<PostDataPendaftaran> call, Throwable t) {

            }
        });

    }
}