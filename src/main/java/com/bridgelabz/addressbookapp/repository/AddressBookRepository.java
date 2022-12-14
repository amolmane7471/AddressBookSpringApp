package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {
    @Query(value = "select * from address_book order by city ",nativeQuery = true)
    List<AddressBookData> sortByCity();
    @Query(value = "select * from address_book order by state",nativeQuery = true)
    List<AddressBookData> sortByState();
}
