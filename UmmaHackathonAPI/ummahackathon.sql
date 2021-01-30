-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Jan 2021 pada 05.41
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ummahackathon`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_hadroh`
--

CREATE TABLE `data_hadroh` (
  `nama_hadroh` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `link_video` varchar(255) NOT NULL,
  `id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_hadroh`
--

INSERT INTO `data_hadroh` (`nama_hadroh`, `alamat`, `deskripsi`, `link_video`, `id`) VALUES
('Grup Muhibbul Musthofa', 'Jalan Taqwa Mata merah', 'Tim Hadroh Grup Muhibbul Musthofa merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan Pondok Pesantren Muhibbul Mustofa .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74', '', 1),
('Syababul Muhajirin', 'Jl. Ogan raya Sako', 'Tim Hadroh Syababul Muhajairin merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan Pondok Pesantren Al Muhajirin .Tim hadroh ini sudah mejuarai beberapa perlombaan seni islami diantaranya : juara 2 pada ajang HAB KEMENAG Ke-74 tigkat', '', 2),
('team hadroh pesantren ar riyadh', 'jalan kapten a.tivai ', 'Tim Hadroh Ar Riyadh merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan Pondok Pesantren Ar Riyadh .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74 tigkat Provinsi yan', '', 3),
('team hadroh sma negeri 7 palembang', 'jalan taqwa mata merah lr.manggis 3', 'Tim Hadroh SMA Negeri 7 merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan SMA Negeri 7 Palembang. Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74 tigkat Provinsi yang', '', 4),
('team pesantren muqinnus sunnah', 'jalan kenten park', 'Tim Hadroh muqinnus Sunnah merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan Pondok Pesantren Muqinnus sunnah yang berlokasi di Kenten Palembang .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 p', '', 5),
('team hadroh babusallam', 'jalan celentang no.13 ,palembang', 'Tim Hadroh babussallam merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan Pondok Pesantren Al-Furqon Palembang .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74 tigkat ', '', 6),
('team hadroh al aqobah 1', 'komplek pt pusri, lorong temon', 'Tim Hadroh Al Aqobah 1 merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan SMA Pusri .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74 tigkat Provinsi yang di selenggara', '', 7),
('team hadroh al muhajirin', 'jalan seduduk putih no 3a, kota palembang', 'Tim Hadroh Al Muhajirin merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan pengurus Masjid Ar-Rahman Palembang .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74 tigkat ', '', 8),
('team hadroh sma unggulan negeri 1 palembang', 'Jalan Srijaya Negara Bukit Besar, Lorong Hibah II, Bukit Lama, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30139', 'Tim Hadroh SMA Negeri 1 Palembang merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan SMA Negeri 1 Palembang .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74 tigkat Pro', '', 9),
('team hadroh al-amalul', 'Jl. Lunjuk Jaya, Lorok Pakjo, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30137', 'Tim Hadroh Al Amalul merupakan salah satu tim hadroh asal Palembang yang dibawahi oleh yayasan Panti Asuhan Siti Aisyah Palembang .Tim hadroh ini sudah menjuari beberapa perlombaan seni islami diantaranya : juara 1 pada ajang HAB KEMENAG Ke-74 tigkat Prov', '', 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pendaftaran`
--

CREATE TABLE `data_pendaftaran` (
  `id` int(11) NOT NULL,
  `nama_pengisi` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `no_whatsapp` int(255) NOT NULL,
  `jenis_kegiatan` varchar(255) NOT NULL,
  `tema` varchar(255) NOT NULL,
  `jmlhpeserta` int(255) NOT NULL,
  `tglkegiatan` varchar(255) NOT NULL,
  `waktukegiatan` varchar(255) NOT NULL,
  `jam_mulai` varchar(255) NOT NULL,
  `jam_selesai` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_pendaftaran`
--

INSERT INTO `data_pendaftaran` (`id`, `nama_pengisi`, `email`, `no_whatsapp`, `jenis_kegiatan`, `tema`, `jmlhpeserta`, `tglkegiatan`, `waktukegiatan`, `jam_mulai`, `jam_selesai`) VALUES
(1, 'rafli', 'r@gmail.com', 80202020, 'ngaji', 'abdul somad dateng', 200, '22-04-2020', '18', '18', '18'),
(2, 'rafli', 'r@gmail.com', 80202020, 'ngaji', 'abdul somad dateng', 200, '22-04-2020', '18.00 - 20.00', '18.00', '18.00'),
(3, 'rafli', 'rafli@gmail.com', 82828282, 'ramadhon', 'ramadhon', 15, '31-01-2021', '60 menit', '18.00', '18.00'),
(4, 'rafli', 'rafli@gmail.com', 82828282, 'ramadhon', 'ramadhon', 15, '31-01-2021', '60 menit', '18.00', '18.00'),
(5, 'rafli', 'r@gnail,com', 1231, 'romadhon', 'romadhon', 15, '30-01-2021', '2 jam', '10.00', '12.00'),
(6, 'sadad', 'asda@gmail.com', 1231231231, 'romadhon', 'romadhon', 15, '30-01-2021', '2 jam', '18.00', '20.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_qori`
--

CREATE TABLE `data_qori` (
  `id` int(11) NOT NULL,
  `nama_qori` varchar(255) NOT NULL,
  `umur` int(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `karir` varchar(255) NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `link_video` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_qori`
--

INSERT INTO `data_qori` (`id`, `nama_qori`, `umur`, `alamat`, `karir`, `deskripsi`, `link_video`) VALUES
(1, 'Muhammad Rifqi Hawari ', 13, 'jalan plaju perumahan villa azhar ', 'pelajar', 'juara III Kategori Tilawah tingkat Pelajar sekota palembang\r\n Peringkat III di MTQ Internasional\r\n', ''),
(2, 'Muhammad Bayu Putra Pratama', 20, 'jalan taqwa mata merah', 'mahasiswa', 'Anggota Forum Kerja sama  Rohani Islam Perguruan Tinggi Kedinasan', 'https://www.instagram.com/p/B1moQ_TFPWoRpqb09IRNYutOtjiWwr2nS3ocuQ0/'),
(3, 'Syamsuri Firdaus ', 20, 'jalan taqwa mat merah', 'mahasiswa', 'siswa MAN 1 Kabupaten Bima, Nusa Tenggara Barat. Universitas Indonesia (UI) jurusan Sastra Arab  Juara I MTQ Nasional di Ambon juara I MTQ Internasional\r\n', ''),
(4, 'Muhammad Ihsan Ramadhan', 20, 'jalan mayor zen', 'mahasiswa ', 'juara pertama dalam ajang Musabaqah Internasional Tijan An Noor di Doha, Qatar pada 9-19 Maret 2019\r\n-Juara 3 Murottal Putra STQ Jawa Barat 2017\r\n-Harapan 2 Tilawah Anak-anak STQ Nasional Kalimantan Utara 2017\r\n-Juara 2 Semesta Bertilawah MNC TV 2017\r\n', ''),
(5, 'Muhammad Miftah Farid.', 16, 'jalan jendral sudirman km 4.5', 'pelajar', 'juara 1 Lomba MTQ tingkat Kota', ''),
(6, 'fadhil ramadhan', 23, 'jalan mayor zen lorong pinang ,kalidoni,palembang', 'mahasiswa', 'salah satu lulusan sma negeri 7 palembang yang berprestasi dan memenangkan lomba mtq tingkat kota ', ''),
(7, 'taufiq qurahman', 16, 'jalan panjat pinang ,sei selayur,palembang', 'pelajar', 'salah satu siswa sma negeri 1 kota palembang ini adalah salah satu siwa terbaik yang di punya oleh sekolahnya , taufiq bahkan mendapatkan juara 3 pada lomba tilwah tingkat kota ', ''),
(8, 'ananda ahmand furqon', 21, 'jalan sukabangun lorong sukatani ,ilir timur ,palembang', 'mahasiswa', 'ananda salah satu mahasiswa fakultas teknik elektro universitas sriwijaya yang berprestasi dibidang tilawah , ananda mendapatkan juara harapan 1 tilawah tingkat universitas sekota palembang', ''),
(9, 'Khotibul Umam, SQ. S.Pd.I', 25, 'Sukamoro, Talang Kelapa, Banyu Asin Regency, South Sumatra 30961 ', 'PMII, JHQ (Jam\'iyyah Hafadzah AlQuran), BEM PTIQ', 'Khotibul Umam merupakan imam tetap shalat rawatib di Masjid Attaqwa Komplek Bank Mandiri komplek pertamina palembang. Menyelesaikan kesarjanaan dalam bidang pendidikan di PTIQ palembang', ''),
(10, 'Ma\'ruf Hidayatullah Lc', 23, 'Siring Agung, Ilir Barat I, Palembang City, South Sumatra', 'Bendahara PCNU Yaman.', 'Ma\'ruf Hidayatullah Lc, merupakan seorang muballigh lulusan Universitas Al-ahgaff, Tarim, Hadramaut, Yaman. Mendalami Ilmu Agama di Pondok Pesantren Darul lughoh Wad Da’wah, Bangil, Pasuruan. Saat ini, beliau merupakan bendahara PCNU Yaman.', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_ustad`
--

CREATE TABLE `data_ustad` (
  `id` int(11) NOT NULL,
  `nama_ustad` varchar(255) DEFAULT NULL,
  `umur` int(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `karir` varchar(255) NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `link_video` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_ustad`
--

INSERT INTO `data_ustad` (`id`, `nama_ustad`, `umur`, `alamat`, `karir`, `deskripsi`, `link_video`) VALUES
(1, 'Fajar Sani Nasution, S.Ag.', 34, 'Jln mayor zen komplek pusri Palembang', 'Lulusan Aqidah Filsafat Universitas Al Azhar. Menyelesaikan magister hingga doktor di UIN SYarif Hidayatullah Jakarta. ', 'Saat ini beliau merupakan dosen tetap pascasarjana di UIN Raden Fattah, Bidang Filsafat dan sejarah peradaban islam.', ''),
(2, 'Dedi Kustian, S.E.I., M.ESy', 43, 'Jln Yos. S.3 ilir Palembang', 'Alumni pondok pesantren An-nur Yogyakarta dan Nurul Quran (Pamulang)', 'Sehari-hari. beliau merupakan imam masjid dan mengisi kajian di Masjid Inti Iman (SUkabangun), Masjid Al Ikhlas (KM7) dan beberpa Majelis Taklim.', ''),
(3, 'Dr. Ahmad Azizan, MA', 40, 'Jln. Padang Selasa No. 1705 Palembang', 'S1 Pendidikan Tafsir Hadis di Universitas Islam Negeri Alauddin Makassar, S2 Pendidikan Tafsir Hadis di Universitas Islam Negeri Alauddin Makassar, Guru Pondok Pesantren Raudhatul Ulum Sakatiga. ', 'Aktif Sebagai Guru di PP Raudhatul Ulum Sakatiga, Serta tergabung dalam pengurus NU Propinsi Sumatera Selatan', ''),
(4, 'Ahmad Reinaldi Akbar SE.I', 58, 'Jln. Makrayu Palembang', 'Ketua Bidang Fatwa MUI DKI Jakarta, LDNU PBNU', 'seorang pendakwah juga akademisi yang bergelut dalam bidang Tafisr dan Hadist. Setelah menimba ilmu di Ponpes Salaf Al - Falah, Ploso, Kediri, Jawa Timur, beliau kemudian menempuh pendidikan perguruan tinggi hingga s3 di UIN Syarif Hidayatullah Jakarta da', ''),
(5, 'Dr. Habiburrahman, M. Th.I', 36, 'Jln. KHM. Asyik kel 3-4 Ulu Palembang', 'Pengurus Rabithah Alawiyah', 'merupakan muballigh Indoenesia yang tidak perlu diragukan lagi keilmuan agamanya. Habib Bahar, sapaan akrab beliau, menempuh pendidikan kesarjanaan di Yordania. Tepatnya di Universitas Mu’tah pada jenjang Strata 1 dan Universitas Yarmuk pada pendidikan ma', ''),
(6, 'andi Budiono, Lc., M.HI, MA', 45, 'Lorong Melati 2, Lorok Pakjo, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30151', 'wakil ketua LKKNU PCNU Sidoarjo', 'merupakan mahasiswa alumni Universitas Al-Azhar, Kairo yang menyelesaikan studi dalam bidang Tafsir Hadis. Gelar Lc.nya tidak membuatnya berpuas diri, sehingga beliau menempuh pendidikan magister di dua perguruan tinggi sekaligus. Yaitu UIN Sunan Ampel Su', ''),
(7, 'H. Ahmad marzuky , Lc\r\n', 47, 'Palembang, Bukit Lama, Ilir Barat I, Palembang City, South Sumatra 30128', 'Indonesia Murojaah, Lapkesdam PWNU Kaltim', 'Kegiatannya saat ini adalah menjadi Ketua Koordinator Program Tahfidz serta mengajar Diniyah di Al Hidayah Boarding School,', ''),
(8, 'naufal Hidayat, Lc., S.S.I, M.E.I', 31, 'jalan baiai indah , sako,palembang', 'DMI Kota Bogor, MUI Kota Bogor, Penyuluh Agama Islam Kota Bogor', 'Magister Ekonomi Islam yang berprofesi sebagai penyuluh Agama Kota Bogor. Menyelesaikan S1 di Dirasat Islamiyah UIN Jakarta dan S2 di UIKA Bogor dalam bidang Ekonomi Islam. Menimba Ilmu Agama di Pondok Pesantren Tebuireng Jombang dan Pesantren Luhur Ilmu ', ''),
(9, 'Dr. Ali bukhari, MA.', 27, 'jalan marzuki ali perumahan citra grand city', 'Anggota Lajnah Pentashihan Mushaf al-Qur’an DEPAG RI Anggota Tim Penyusun Tafsir Tematik Depag hingga Anggota Dewan pakar Tafsir Pusat Studi Al-Qur’an (PSQ) Jakarta.', 'Kemapuanya dalam bidang Al-Quran Tafisr tidak perlu diragukan lagi. Pengasuh pesantren Nurul Quran Bogor ini sekaligus Pendiri dan Ketua Yayasan mahyuddin Ahmad Jakarta ini, sejak kecil telah menghafal Al-Quran di Ponpes Pesantren Sunan Pandanaran Yogyaka', ''),
(10, 'H. Fathur al fatih , MA', 33, 'jalan serapan lr. mangga1 ,bukit kecil, palembang', 'anggota dprd wilayah kota palembang', 'Magister dalam kajian Al-Qur\'an ini menyelesaikan S2 di UIN Syarif Hidayatullah Jakarta dan S1 di UIN Sunan Kalijaga Jogjakarta.', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal_pengisi_acara`
--

CREATE TABLE `jadwal_pengisi_acara` (
  `id` int(11) NOT NULL,
  `nama_kegiatan` varchar(255) NOT NULL,
  `tema` varchar(255) NOT NULL,
  `waktu` varchar(255) NOT NULL,
  `lokasi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_hadroh`
--
ALTER TABLE `data_hadroh`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `data_pendaftaran`
--
ALTER TABLE `data_pendaftaran`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `data_qori`
--
ALTER TABLE `data_qori`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `data_ustad`
--
ALTER TABLE `data_ustad`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `jadwal_pengisi_acara`
--
ALTER TABLE `jadwal_pengisi_acara`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `data_hadroh`
--
ALTER TABLE `data_hadroh`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `data_pendaftaran`
--
ALTER TABLE `data_pendaftaran`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `data_qori`
--
ALTER TABLE `data_qori`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `data_ustad`
--
ALTER TABLE `data_ustad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `jadwal_pengisi_acara`
--
ALTER TABLE `jadwal_pengisi_acara`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
