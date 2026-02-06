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
```[nmcli](/man/nmcli) device status```

## Download file
```[wget](/man/wget) [url]```
```[curl](/man/curl) -O [url]```
```[aria2c](/man/aria2c) [url]```
```[axel](/man/axel) [url]```

## Get information about domain
```[whois](/man/whois) [ip]```

## Ping another device
```[ping](/man/ping) [ip]```
```[mtr](/man/mtr) [ip]```

## Configure network interface
```[ifconfig](/man/ifconfig)```

## Show the hostname of your box
```[hostname](/man/hostname)```
```[hostnamectl](/man/hostnamectl)```

## Trace the path that a packet takes to its destination
```[traceroute](/man/traceroute) [ip]```
```[tracepath](/man/tracepath) [ip]```

## Telnet connection
```[telnet](/man/telnet) [ip] [port]```

## DNS lookup and display server answer
```[dig](/man/dig) [ip]```
```[nslookup](/man/nslookup) [ip]```
```[host](/man/host) [ip]```

## Release IP and get a new one from DHCP
```[dhclient](/man/dhclient) -r```

## List open sockets
```[netstat](/man/netstat) -l```
```[lsof](/man/lsof) -i```
```[ss](/man/ss) -l```

## Show routing table
```[ip](/man/ip) route```
```[route](/man/route)```

## Show open ports
```[ss](/man/ss) -tuln```
```[netstat](/man/netstat) -tuln```

## Test port connectivity
```[nc](/man/nc) -zv [host] [port]```

## Show bandwidth usage
```[iftop](/man/iftop)```
```[nethogs](/man/nethogs)```
```[vnstat](/man/vnstat)```
```[bmon](/man/bmon)```
```[nload](/man/nload)```
