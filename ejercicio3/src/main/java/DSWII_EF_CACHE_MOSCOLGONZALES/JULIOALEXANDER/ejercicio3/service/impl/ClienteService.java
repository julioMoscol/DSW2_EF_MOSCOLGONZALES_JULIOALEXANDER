package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service.impl;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Cliente;
import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.repository.ClienteRepository;
import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service.IClienteService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Cacheable(value = "clienteDni", key="dni")
    @Override
    public List<Cliente> obtenerClienteXDni(Integer dni) {
        return clienteRepository.obtenerClientePorDni(dni);
    }

    @Override
    public Cliente registarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @CachePut(value = "clienteDni", key = "#cliente.idcliente")
    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @CacheEvict(value = "clienteDni", allEntries = true)
    @Override
    public void eliminarCliente(Integer id) {

    }

    @CacheEvict(value = {"clienteDni"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }
}
