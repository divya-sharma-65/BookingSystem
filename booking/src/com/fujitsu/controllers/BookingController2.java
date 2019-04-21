package com.fujitsu.controllers;

	import java.util.List;

	import javax.servlet.http.HttpSession;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;

	
import com.fujitsu.beans.booking.Booking;
import com.fujitsu.exception.ServiceException;
import com.fujitsu.services.BookingService;


	@Controller
	public class BookingController2 {
		
		@Autowired
		private BookingService bookingService;
		
		@GetMapping("/bookings")
		public String viewAllBookings(HttpSession session)
		{
			try {
				List<Booking> bookings = bookingService.findAllBooking();
				session.setAttribute("bookingList", bookings);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "bookingview";
		}
		
		@GetMapping("/add")
		public String addBookingForm()
		{
			return "bookingaddform";
		}
		
		@PostMapping("/addBooking")
		public String addBooking(Booking booking,ModelMap map)
		{
			try {
				bookingService.add(booking);
//				map.addAttribute("message","Booking "+booking.getBookingId()+" is added successfully");
				
				map.addAttribute("message","Booking  is added successfully");

				return "success";

			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				map.addAttribute("bookingadderror","Sorry! Product could not be added ");
				return "bookingaddform";

			}
			
		}
		
	
			
		
	
		@GetMapping("/delete")
		public String deleteBookingForm() {
			return "bookingdeleteform";
		}
		
		@PostMapping("/deleteBooking")
		public String deleteBooking(Booking booking,ModelMap map)
		{
			try {
				bookingService.remove(booking);
				map.addAttribute("message","Booking "+booking.getBookingId()+" is deleted successfully");
				return "success";

			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				map.addAttribute("bookingdeleteerror","Sorry! Booking could not be deleted ");
				return "bookingdeleteform";

			}
		}
	
	}

	
