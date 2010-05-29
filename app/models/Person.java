/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.*;
import play.db.jpa.Model;

/**
 *
 * @author waxzce
 */
@Entity
public class Person extends Model {

    @Required
    public String firstName;
    @Required
    public String lastName;
    @Required
    public String login;
    @Required
    @Password
    public String password;
    @Required
    @Email
    public String mail;
    @Required
    @InPast
    public Date dateOfBirth;
}