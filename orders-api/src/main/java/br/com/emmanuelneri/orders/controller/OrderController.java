package br.com.emmanuelneri.orders.controller;

import br.com.emmanuelneri.orders.dto.OrderDTO;
import br.com.emmanuelneri.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrderDTO> findAll() {
        return orderService.findAll();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public OrderDTO findById(@PathVariable(name = "id") Long id) {
        return orderService.findById(id);
    }

}
