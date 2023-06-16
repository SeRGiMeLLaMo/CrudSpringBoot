function eliminar (id){
    swal({
      title: "¿Estas seguro? Eliminaras al usuario ",
      text: "Once deleted, you will not be able to recover this imaginary file!",
      icon: "warning",
      buttons: true,
      dangerMode: true,
    })
    .then((SI) => {
      if (SI) {
        $.ajax({
          url:"/eliminar/"+id,
          success: function(res){
                console.log(res);
          }
        })
        swal("Se elimino correctamente, es usted un maquina!!", {
          icon: "success",
        }).then((ok)=>{
            location.href = "/listar";
        })
      } else {
        swal("Ya decia yo que no era usted capaz...");
      }
    });
}