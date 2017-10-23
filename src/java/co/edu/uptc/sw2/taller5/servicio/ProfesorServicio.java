package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.ProfesorDTO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author david ramirez
 */
@Path("/Estudiantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfesorServicio {
    /**
     * retorna una lista con los profesores que se encuentran en la base de datos
     *
     * @return retorna una lista de ProfesorDTO
     * @generated
     */
    @GET
    public List<ProfesorDTO> obtenerTodosEstuiantes() {
        return ProveedorInformacion.instance().obtenerTodos(ProfesorDTO.class);
    }

    /**
     * @param id identificador del elemento Profesor
     * @return Profesor del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public ProfesorDTO obtenerCarrera(@PathParam("id") Long id) {
        return (ProfesorDTO) ProveedorInformacion.instance().obtener(ProfesorDTO.class, id);
    }

    /**
     * almacena la informacion de Profesor
     *
     * @param dto Estudainte  a guardar
     * @return Estudiante con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public ProfesorDTO guardarCarrera(ProfesorDTO dto) {
        return (ProfesorDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Estudiante con el identificador dado
     *
     * @param id identificador del Estudiante
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarCarrera(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(ProfesorDTO.class, id);
    }
}
