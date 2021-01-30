<?php

use Restserver\Libraries\REST_Controller;
defined('BASEPATH') OR exit('No direct script access allowed');

require APPPATH . 'libraries/REST_Controller.php';
require APPPATH . 'libraries/Format.php';

class DataHadroh extends REST_Controller
{
	function __construct($config = 'rest') {
        parent::__construct($config);
        $this->load->database();
    }

    //Menampilkan data planet
    function index_get() {
        $id = $this->get('id');
        if ($id == '') {
            $data = $this->db->get('data_hadroh')->result();
        } else {
            $this->db->where('id', $id);
            $data = $this->db->get('data_hadroh')->result();
        }
        $this->response([
			'status' => true,
			'data' => $data
		],REST_Controller::HTTP_OK);
    }

    //Masukan function selanjutnya disini
}
