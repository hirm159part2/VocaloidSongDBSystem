package vocaloid.songdb.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class MstUser {
	@Id
	@Column(length = 10)
	private String userId;

	@Column(length = 20)
	private String userName;

	@Column(length = 20)
	private String password;

	@Column(length = 50)
	private String mail;

}
