# Sieć

## Zewnętrzny adres IP
```[curl](/man/curl) ifconfig.me```
```[dig](/man/dig) +short myip.opendns.com @resolver1.opendns.com```

## Wyświetl interfejsy sieciowe
```[ifconfig](/man/ifconfig) -a```
```[ip](/man/ip) a```
```[ip](/man/ip) link show```
```[nmcli](/man/nmcli) device status```

## Pobierz plik
```[wget](/man/wget) [url]```
```[curl](/man/curl) -O [url]```
```[aria2c](/man/aria2c) [url]```

## Informacje o domenie
```[whois](/man/whois) [ip]```

## Ping do urządzenia
```[ping](/man/ping) [ip]```
```[mtr](/man/mtr) [ip]```

## Nazwa hosta
```[hostname](/man/hostname)```
```[hostnamectl](/man/hostnamectl)```

## Trasowanie pakietów
```[traceroute](/man/traceroute) [ip]```
```[tracepath](/man/tracepath) [ip]```

## Połączenie Telnet
```[telnet](/man/telnet) [ip] [port]```

## Sprawdzenie DNS
```[dig](/man/dig) [domena]```
```[nslookup](/man/nslookup) [domena]```
```[host](/man/host) [domena]```

## Wyświetl otwarte gniazda
```[netstat](/man/netstat) -l```
```[lsof](/man/lsof) -i```
```[ss](/man/ss) -l```

## Wyświetl tablicę routingu
```[ip](/man/ip) route```
```[route](/man/route)```

## Skanuj otwarte porty
```[nmap](/man/nmap) [ip]```

## Wyślij żądanie HTTP
```[curl](/man/curl) [url]```
```[httpie](/man/httpie) [url]```

## Transfer plików SSH
```[scp](/man/scp) [plik] [użytkownik]@[host]:[ścieżka]```
```[sftp](/man/sftp) [użytkownik]@[host]```

## Monitor ruchu sieciowego
```[iftop](/man/iftop)```
```[nethogs](/man/nethogs)```
```[bmon](/man/bmon)```
