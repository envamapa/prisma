/*
 * Generated by JasperReports - 10/8/15 12:15 PM
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;



/**
 *
 */
public class mensaje_1444324556158_702633 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_JASPER_REPORT = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_SORT_FIELDS = null;
    private JRFillParameter parameter_REPORT_FILE_RESOLVER = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_p_proyectoId = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_CONTEXT = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_FILTER = null;
    private JRFillParameter parameter_SUBREPORT_DIR = null;
    private JRFillParameter parameter_REPORT_FORMAT_FACTORY = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_REPORT_TEMPLATES = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillField field_nombre = null;
    private JRFillField field_id = null;
    private JRFillField field_parametrizado = null;
    private JRFillField field_redaccion = null;
    private JRFillField field_descripcion = null;
    private JRFillField field_clave = null;
    private JRFillField field_numero = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_JASPER_REPORT = (JRFillParameter)pm.get("JASPER_REPORT");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_SORT_FIELDS = (JRFillParameter)pm.get("SORT_FIELDS");
        parameter_REPORT_FILE_RESOLVER = (JRFillParameter)pm.get("REPORT_FILE_RESOLVER");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
        parameter_p_proyectoId = (JRFillParameter)pm.get("p_proyectoId");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_CONTEXT = (JRFillParameter)pm.get("REPORT_CONTEXT");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_URL_HANDLER_FACTORY = (JRFillParameter)pm.get("REPORT_URL_HANDLER_FACTORY");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_FILTER = (JRFillParameter)pm.get("FILTER");
        parameter_SUBREPORT_DIR = (JRFillParameter)pm.get("SUBREPORT_DIR");
        parameter_REPORT_FORMAT_FACTORY = (JRFillParameter)pm.get("REPORT_FORMAT_FACTORY");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_REPORT_TEMPLATES = (JRFillParameter)pm.get("REPORT_TEMPLATES");
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
        field_nombre = (JRFillField)fm.get("nombre");
        field_id = (JRFillField)fm.get("id");
        field_parametrizado = (JRFillField)fm.get("parametrizado");
        field_redaccion = (JRFillField)fm.get("redaccion");
        field_descripcion = (JRFillField)fm.get("descripcion");
        field_clave = (JRFillField)fm.get("clave");
        field_numero = (JRFillField)fm.get("numero");
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = "/home/lorena/git/AplicacionTTB064/src/main/webapp/resources/ireport/subreports/"; //$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = null; //$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = ((java.lang.String)field_clave.getValue()) + ((java.lang.String)field_numero.getValue()) + " " + ((java.lang.String)field_nombre.getValue()); //$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = ((java.lang.String)field_descripcion.getValue()); //$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = "<b>Redacción:</b> " + ((java.lang.String)field_redaccion.getValue()); //$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = ((java.lang.Integer)field_id.getValue()); //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = ((java.sql.Connection)parameter_REPORT_CONNECTION.getValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = ((java.lang.String)parameter_SUBREPORT_DIR.getValue()) + "mensaje/mensaje_parametro.jasper"; //$JR_EXPR_ID=15$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = "/home/lorena/git/AplicacionTTB064/src/main/webapp/resources/ireport/subreports/"; //$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = null; //$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = ((java.lang.String)field_clave.getOldValue()) + ((java.lang.String)field_numero.getOldValue()) + " " + ((java.lang.String)field_nombre.getOldValue()); //$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = ((java.lang.String)field_descripcion.getOldValue()); //$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = "<b>Redacción:</b> " + ((java.lang.String)field_redaccion.getOldValue()); //$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = ((java.lang.Integer)field_id.getOldValue()); //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = ((java.sql.Connection)parameter_REPORT_CONNECTION.getValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = ((java.lang.String)parameter_SUBREPORT_DIR.getValue()) + "mensaje/mensaje_parametro.jasper"; //$JR_EXPR_ID=15$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = "/home/lorena/git/AplicacionTTB064/src/main/webapp/resources/ireport/subreports/"; //$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = null; //$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = ((java.lang.String)field_clave.getValue()) + ((java.lang.String)field_numero.getValue()) + " " + ((java.lang.String)field_nombre.getValue()); //$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = ((java.lang.String)field_descripcion.getValue()); //$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = "<b>Redacción:</b> " + ((java.lang.String)field_redaccion.getValue()); //$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = ((java.lang.Integer)field_id.getValue()); //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = ((java.sql.Connection)parameter_REPORT_CONNECTION.getValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = ((java.lang.String)parameter_SUBREPORT_DIR.getValue()) + "mensaje/mensaje_parametro.jasper"; //$JR_EXPR_ID=15$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
