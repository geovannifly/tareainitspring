package com.example.initspringboot.controllers;

import com.example.initspringboot.models.Clientes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @GetMapping("/nuevo")
    public Clientes NuevoCliente(){
        Clientes nuevoCliente = new Clientes();
        nuevoCliente.setNombre("geovanni perez");
        nuevoCliente.setDireccion("ciudad");
        nuevoCliente.setTelefono(23456987);
        nuevoCliente.setNit("98297775");
        nuevoCliente.setEmail("geovanni@email.com");
        return nuevoCliente;
    }

    @GetMapping("/listaClientes")
    public List<Clientes> ListaCliente(){

        List<Clientes> listaClientes = new ArrayList<>();

        Clientes cliente1 = new Clientes("geovanni perez", "ciudad", 23456987, "98297775", "geovanni@email.com");
        Clientes cliente2 = new Clientes("juan perez", "ciudad", 23456987, "98297775", "juan@correo.com");
        Clientes cliente3 = new Clientes();

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        return listaClientes;

    }

 // notacion @PathVariable
    @GetMapping("/cliente/{nitCliente}")
    public Clientes getClienteByNit(@PathVariable String nitCliente){
        Clientes cliente = new Clientes();
        cliente.setNombre("geovanni perez");
        cliente.setDireccion("ciudad");
        cliente.setTelefono(23456987);
        cliente.setNit(nitCliente);
        cliente.setEmail("geovanni@correo.com");
        return cliente;
    }

    @PostMapping("/insertarCliente")
    public String insertarCliente(@RequestBody Clientes cliente) {

        return cliente.insertarCliente();
    }
}
