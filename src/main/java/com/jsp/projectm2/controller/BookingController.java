package com.jsp.projectm2.controller;

public class BookingController {
  @PostMapping
	public ResponseEntity<ResponseStructure<Booking>> addBooking(@RequestParam int customerId,
			@RequestParam int[] medicineId,@RequestBody BookingDto bookingDto){
		return service.addBooking(customerId,medicineId,bookingDto);
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Booking>>  cancelBooking(@RequestParam int bookingId){
		return service.cancelBooking(bookingId);
	}
}
