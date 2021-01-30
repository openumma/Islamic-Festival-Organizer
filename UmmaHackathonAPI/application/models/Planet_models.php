<?php

class Planet_models extends CI_Model
{
	public function getPlanet(){
		return $this->db->get('planet')->result();
	}
}
