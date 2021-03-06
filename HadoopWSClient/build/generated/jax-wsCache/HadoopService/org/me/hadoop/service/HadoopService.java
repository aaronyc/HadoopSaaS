
package org.me.hadoop.service;

import java.util.List;
import javax.activation.DataHandler;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HadoopService", targetNamespace = "http://service.hadoop.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HadoopService {


    /**
     * 
     * @param filename
     * @return
     *     returns org.me.hadoop.service.TFileSegment
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadFile", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.DownloadFile")
    @ResponseWrapper(localName = "downloadFileResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.DownloadFileResponse")
    public TFileSegment downloadFile(
        @WebParam(name = "filename", targetNamespace = "")
        String filename)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param filename
     * @return
     *     returns javax.activation.DataHandler
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFile", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetFile")
    @ResponseWrapper(localName = "getFileResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetFileResponse")
    public DataHandler getFile(
        @WebParam(name = "filename", targetNamespace = "")
        String filename);

    /**
     * 
     * @param inname
     * @param outname
     * @return
     *     returns org.me.hadoop.service.TJobOutput
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOutput", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetOutput")
    @ResponseWrapper(localName = "getOutputResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetOutputResponse")
    public TJobOutput getOutput(
        @WebParam(name = "inname", targetNamespace = "")
        String inname,
        @WebParam(name = "outname", targetNamespace = "")
        String outname)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVersion", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetVersion")
    @ResponseWrapper(localName = "getVersionResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetVersionResponse")
    public String getVersion();

    /**
     * 
     * @param buffer
     * @param index
     * @param merge
     * @param filename
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadFile", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.UploadFile")
    @ResponseWrapper(localName = "uploadFileResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.UploadFileResponse")
    public boolean uploadFile(
        @WebParam(name = "filename", targetNamespace = "")
        String filename,
        @WebParam(name = "index", targetNamespace = "")
        int index,
        @WebParam(name = "buffer", targetNamespace = "")
        byte[] buffer,
        @WebParam(name = "merge", targetNamespace = "")
        boolean merge);

    /**
     * 
     * @param inname
     * @return
     *     returns org.me.hadoop.service.TJobInput
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInput", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetInput")
    @ResponseWrapper(localName = "getInputResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetInputResponse")
    public TJobInput getInput(
        @WebParam(name = "inname", targetNamespace = "")
        String inname)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param filename
     * @param handler
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "putFile", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.PutFile")
    @ResponseWrapper(localName = "putFileResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.PutFileResponse")
    public boolean putFile(
        @WebParam(name = "filename", targetNamespace = "")
        String filename,
        @WebParam(name = "handler", targetNamespace = "")
        DataHandler handler);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isClusterAvailable", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.IsClusterAvailable")
    @ResponseWrapper(localName = "isClusterAvailableResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.IsClusterAvailableResponse")
    public boolean isClusterAvailable();

    /**
     * 
     * @return
     *     returns java.util.List<org.me.hadoop.service.TJobModelHeader>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listModels", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.ListModels")
    @ResponseWrapper(localName = "listModelsResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.ListModelsResponse")
    public List<TJobModelHeader> listModels();

    /**
     * 
     * @param mname
     * @return
     *     returns org.me.hadoop.service.TJobModel
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getModel", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetModel")
    @ResponseWrapper(localName = "getModelResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetModelResponse")
    public TJobModel getModel(
        @WebParam(name = "mname", targetNamespace = "")
        String mname)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param filename
     * @return
     *     returns org.me.hadoop.service.TJobModel
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addModel", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.AddModel")
    @ResponseWrapper(localName = "addModelResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.AddModelResponse")
    public TJobModel addModel(
        @WebParam(name = "filename", targetNamespace = "")
        String filename)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param mname
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeModel", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RemoveModel")
    @ResponseWrapper(localName = "removeModelResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RemoveModelResponse")
    public boolean removeModel(
        @WebParam(name = "mname", targetNamespace = "")
        String mname);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "refreshModelRepository", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RefreshModelRepository")
    @ResponseWrapper(localName = "refreshModelRepositoryResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RefreshModelRepositoryResponse")
    public boolean refreshModelRepository();

    /**
     * 
     * @return
     *     returns java.util.List<org.me.hadoop.service.TJobInputHeader>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listInputs", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.ListInputs")
    @ResponseWrapper(localName = "listInputsResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.ListInputsResponse")
    public List<TJobInputHeader> listInputs();

    /**
     * 
     * @param filename
     * @return
     *     returns org.me.hadoop.service.TJobInput
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addInput", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.AddInput")
    @ResponseWrapper(localName = "addInputResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.AddInputResponse")
    public TJobInput addInput(
        @WebParam(name = "filename", targetNamespace = "")
        String filename)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param inname
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeInput", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RemoveInput")
    @ResponseWrapper(localName = "removeInputResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RemoveInputResponse")
    public boolean removeInput(
        @WebParam(name = "inname", targetNamespace = "")
        String inname);

    /**
     * 
     * @param inname
     * @return
     *     returns java.util.List<org.me.hadoop.service.TJobOutputHeader>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listOutputs", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.ListOutputs")
    @ResponseWrapper(localName = "listOutputsResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.ListOutputsResponse")
    public List<TJobOutputHeader> listOutputs(
        @WebParam(name = "inname", targetNamespace = "")
        String inname);

    /**
     * 
     * @param inname
     * @param outname
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeOutput", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RemoveOutput")
    @ResponseWrapper(localName = "removeOutputResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RemoveOutputResponse")
    public boolean removeOutput(
        @WebParam(name = "inname", targetNamespace = "")
        String inname,
        @WebParam(name = "outname", targetNamespace = "")
        String outname);

    /**
     * 
     * @param mname
     * @param inname
     * @return
     *     returns org.me.hadoop.service.TJobRun
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "prepareJob", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.PrepareJob")
    @ResponseWrapper(localName = "prepareJobResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.PrepareJobResponse")
    public TJobRun prepareJob(
        @WebParam(name = "mname", targetNamespace = "")
        String mname,
        @WebParam(name = "inname", targetNamespace = "")
        String inname)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param mname
     * @param desc
     * @param inname
     * @param args
     * @param outname
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "runPreparedJob", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RunPreparedJob")
    public void runPreparedJob(
        @WebParam(name = "mname", targetNamespace = "")
        String mname,
        @WebParam(name = "inname", targetNamespace = "")
        String inname,
        @WebParam(name = "outname", targetNamespace = "")
        String outname,
        @WebParam(name = "desc", targetNamespace = "")
        String desc,
        @WebParam(name = "args", targetNamespace = "")
        String args);

    /**
     * 
     * @param mname
     * @param desc
     * @param inname
     * @param args
     * @return
     *     returns org.me.hadoop.service.TJobRun
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "runJob", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RunJob")
    @ResponseWrapper(localName = "runJobResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.RunJobResponse")
    public TJobRun runJob(
        @WebParam(name = "mname", targetNamespace = "")
        String mname,
        @WebParam(name = "inname", targetNamespace = "")
        String inname,
        @WebParam(name = "desc", targetNamespace = "")
        String desc,
        @WebParam(name = "args", targetNamespace = "")
        String args)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param inname
     * @param outname
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "killJob", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.KillJob")
    @ResponseWrapper(localName = "killJobResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.KillJobResponse")
    public boolean killJob(
        @WebParam(name = "inname", targetNamespace = "")
        String inname,
        @WebParam(name = "outname", targetNamespace = "")
        String outname);

    /**
     * 
     * @param inname
     * @param outname
     * @return
     *     returns org.me.hadoop.service.TJobOutput
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompressedOutput", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetCompressedOutput")
    @ResponseWrapper(localName = "getCompressedOutputResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetCompressedOutputResponse")
    public TJobOutput getCompressedOutput(
        @WebParam(name = "inname", targetNamespace = "")
        String inname,
        @WebParam(name = "outname", targetNamespace = "")
        String outname)
        throws ServiceFault_Exception
    ;

    /**
     * 
     * @param wildcard
     * @param inname
     * @param outname
     * @return
     *     returns org.me.hadoop.service.TJobOutput
     * @throws ServiceFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompressedWCOutput", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetCompressedWCOutput")
    @ResponseWrapper(localName = "getCompressedWCOutputResponse", targetNamespace = "http://service.hadoop.me.org/", className = "org.me.hadoop.service.GetCompressedWCOutputResponse")
    public TJobOutput getCompressedWCOutput(
        @WebParam(name = "inname", targetNamespace = "")
        String inname,
        @WebParam(name = "outname", targetNamespace = "")
        String outname,
        @WebParam(name = "wildcard", targetNamespace = "")
        String wildcard)
        throws ServiceFault_Exception
    ;

}
