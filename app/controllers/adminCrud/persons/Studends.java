/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.adminCrud.persons;

import models.person.Student;
import play.mvc.*;
import play.*;
import controllers.CRUD;
import models.*;

/**
 *
 * @author waxzce
 */
@CRUD.For(Student.class)
public class Studends extends CRUD {
}