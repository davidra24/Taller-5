package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.MateriaDTO;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author david ramirez
 */
public class MateriasServicio {
    /**
     * retorna una lista con las materias que se encuentran en la base de datos
     *
     * @return retorna una lista de ProfesorDTO
     * @generated
     */
    @GET
    public List<MateriaDTO> obtenerTodosEstuiantes() {
        return ProveedorInformacion.instance().obtenerTodos(MateriaDTO.class);
    }

    /**
     * @param id identificador del elemento Materia
     * @return Materia del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public MateriaDTO obtenerCarrera(@PathParam("id") Long id) {
        return (MateriaDTO) ProveedorInformacion.instance().obtener(MateriaDTO.class, id);
    }

    /**
     * almacena la informacion de Profesor
     *
     * @param dto Materia  a guardar
     * @return Materia con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public MateriaDTO guardarCarrera(MateriaDTO dto) {
        return (MateriaDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Materia con el identificador dado
     *
     * @param id identificador del Estudiante
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarCarrera(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(MateriaDTO.class, id);
    }
}