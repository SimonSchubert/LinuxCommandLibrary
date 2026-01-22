# Network

## External IP
```[curl](/man/curl) ifconfig.me```
```[dig](/man/dig) +short myip.opendns.com @resolver1.opendns.com```
```[netcat](/man/netcat) icanhazip.com 80 <<< $'GET / HTTP/1.1\nHost: icanhazip.com\n' | [tail](/man/tail) -n1```

## Get WiFi password
```[cat](/man/cat) /etc/NetworkManager/system-connections/[SSID] | [grep](/man/grep) psk=```

## List network interfaces
```[lspci](/man/lspci) | [egrep](/man/egrep) -i --color 'network|ethernet'```
```[ifconfig](/man/ifconfig) -a```
```[ip](/man/ip) link show```
```[lshw](/man/lshw) -class network```
```[cat](/man/cat) /proc/net/dev```

## Download file
```[wget](/man/wget) [url]```
```[curl](/man/curl) -O [url]```

## Get information about domain
```[whois](/man/whois) [ip]```

## Ping to another device
```[ping](/man/ping) [ip]```

## Configure network interface
```[ifconfig](/man/ifconfig)```

## Show the hostname of your box
```[hostname](/man/hostname) [ip]```

## Trace the path that a packet takes to its destination
```[traceroute](/man/traceroute) [ip]```

## Telnet connection
```[telnet](/man/telnet) [ip] [port]```

## DNS lookup and display server answer
```[dig](/man/dig) [ip]```

## Release IP and get a new one from DHCP
```[dhclient](/man/dhclient) -r```

## List open sockets
```[netstat](/man/netstat) -l```
```[lsof](/man/lsof) -i```
