package com.oms.order.service;

import com.oms.order.model.request.OrderRequest;
import com.oms.order.model.request.OrderStatusUpdate;
import com.oms.order.model.request.OrderUpdate;
import com.oms.order.model.response.OrderResponse;

public interface OrderService {
    OrderResponse addOrder(OrderRequest orderRequest);

    OrderResponse getOrderById(String orderId);

    void deleteOrderById(String orderId);

    OrderResponse getOrderByCustomerId(String customerId);

    OrderResponse getOrderByOrderIdCustomerId(String orderId, String customerId);

    void updateOrder(OrderUpdate orderUpdate, String orderId);

    void updateOrderStatus(OrderStatusUpdate orderStatusUpdate);
}
