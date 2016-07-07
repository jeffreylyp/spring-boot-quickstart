package com.yongpoliu.spring.boot.quickstart;

import lombok.Data;

@Data
public class DBInfo {
  private String dbUrl;

  private String username;

  private String password;

//  public static void main(String[] args) throws IOException {
//    String format = DateFormatUtils.format(new Date(1439971200000l), "yyyy-MM-dd HH:mm:ss");
//    System.out.println(format);
//
//    System.out.println(System.currentTimeMillis());
//
//    final BufferedWriter bufferedWriter = Files.newWriter(new File("filter-address2.txt"), Charset.forName("utf-8"));
//    for (String address : Files.readLines(new File("filter-address.txt"), Charset.forName("utf-8"))) {
//      bufferedWriter.append(address);
//      bufferedWriter.newLine();
//    }
//    bufferedWriter.flush();
//    bufferedWriter.close();
//
//  }
}
