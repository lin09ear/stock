package com.example.stock;

import com.example.stock.model.Company;
import com.example.stock.scraper.Scraper;
import com.example.stock.scraper.YahooFinanceScraper;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.lang.annotation.Documented;

@SpringBootApplication
@EnableScheduling
public class StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);

	}

}
