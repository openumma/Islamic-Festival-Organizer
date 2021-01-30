<?php

use Restserver\Libraries\REST_Controller;
defined('BASEPATH') OR exit('No direct script access allowed');

require APPPATH . 'libraries/REST_Controller.php';
require APPPATH . 'libraries/Format.php';

class DataPendaftaran extends REST_Controller
{
	function __construct($config = 'rest') {
        parent::__construct($config);
        $this->load->database();
    }

    //Menampilkan data planet
    function index_post() {
        $data = array(
                    'id'                => $this->post('id'),
                    'nama_pengisi'      => $this->post('nama_pengisi'),
                    'email'             => $this->post('email'),
                    'no_whatsapp'       => $this->post('no_whatsapp'),
                    'jenis_kegiatan'    => $this->post('jenis_kegiatan'),
                    'tema'              => $this->post('tema'),
                    'jmlhpeserta'       => $this->post('jmlhpeserta'),
                    'tglkegiatan'       => $this->post('tglkegiatan'),
                    'waktukegiatan'     => $this->post('waktukegiatan'),
                    'jam_mulai'         => $this->post('jam_mulai'),
                    'jam_selesai'       => $this->post('jam_selesai'));
        $insert = $this->db->insert('data_pendaftaran', $data);
        if ($insert) {
            $this->response($data, 200);
        } else {
            $this->response(array('status' => 'fail', 502));
		}
	}

    //Masukan function selanjutnya disini
}
