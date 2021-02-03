package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");

	private Date moment = new Date();
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	Product produto = new Product();

	public order() {
	}

	public order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItem() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeitem(OrderItem item) {
		items.add(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem c : items) {
			sum += c.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(getStatus() + "\n");
		sb.append("Client: " + client.toString() + "\n");
		sb.append("Order items:" + "\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();
	}
}
