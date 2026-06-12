# Network

## Interfaces & IP Addresses
**ip** is the modern tool for everything interface-related; **ifconfig** is its deprecated predecessor. **a** is short for **addr**.
```[ip](/man/ip) a```
```[ip](/man/ip) link show```
```[nmcli](/man/nmcli) device status```
```[ifconfig](/man/ifconfig) -a```

Identify the network hardware behind the interfaces.
```[lspci](/man/lspci) | [grep](/man/grep) -i 'network\|ethernet'```
```[lshw](/man/lshw) -class network```
```[ethtool](/man/ethtool) eth0```

## Configuring Interfaces
Bring interfaces up or down and assign addresses manually (root required). Changes made with **ip** are gone after a reboot; make them permanent in your network manager.
```[ip](/man/ip) link set eth0 up```
```[ip](/man/ip) link set eth0 down```
```[ip](/man/ip) addr add 192.168.1.50/24 dev eth0```

Release the DHCP lease and request a new one.
```[dhclient](/man/dhclient) -r eth0```
```[dhclient](/man/dhclient) eth0```

## Wi-Fi
With NetworkManager, **nmcli** scans, connects, and even reveals the password of the current network.
```[nmcli](/man/nmcli) device wifi list```
```[nmcli](/man/nmcli) device wifi connect [SSID] password [password]```
```[nmcli](/man/nmcli) device wifi show-password```

Stored Wi-Fi passwords live in NetworkManager's connection files (root required).
```sudo [grep](/man/grep) -r "psk=" /etc/NetworkManager/system-connections/```

On systems using iwd instead of NetworkManager, use **iwctl**.
```[iwctl](/man/iwctl) station wlan0 get-networks```
```[iwctl](/man/iwctl) station wlan0 connect [SSID]```

## External IP
Your public address as seen from the internet, via HTTP or DNS.
```[curl](/man/curl) ifconfig.me```
```[dig](/man/dig) +short myip.opendns.com @resolver1.opendns.com```

## Testing Connectivity
**ping** checks if a host answers, **traceroute** shows the path packets take, and **mtr** combines both in a live view.
```[ping](/man/ping) [host]```
```[ping](/man/ping) -c 4 [host]```
```[traceroute](/man/traceroute) [host]```
```[tracepath](/man/tracepath) [host]```
```[mtr](/man/mtr) [host]```

Check whether a specific TCP port is reachable.
```[nc](/man/nc) -zv [host] [port]```
```[telnet](/man/telnet) [host] [port]```

Measure raw throughput between two machines (run **iperf3 -s** on one, **-c** on the other).
```[iperf3](/man/iperf3) -s```
```[iperf3](/man/iperf3) -c [serverIp]```

## DNS Lookups
Resolve names to addresses and back. **dig +short** prints just the answer; **-x** does a reverse lookup of an IP.
```[dig](/man/dig) [domain]```
```[dig](/man/dig) +short [domain]```
```[dig](/man/dig) -x [ip]```
```[dig](/man/dig) MX [domain]```
```[host](/man/host) [domain]```
```[nslookup](/man/nslookup) [domain]```
```[resolvectl](/man/resolvectl) query [domain]```

Look up who owns a domain or IP range.
```[whois](/man/whois) [domain]```

## Downloading Files
**wget** downloads and resumes, **curl -O** saves under the remote name (**-L** follows redirects), **aria2c** and **axel** split downloads over parallel connections.
```[wget](/man/wget) [url]```
```[wget](/man/wget) -c [url]```
```[curl](/man/curl) -LO [url]```
```[aria2c](/man/aria2c) [url]```
```[axel](/man/axel) [url]```

## Open Ports & Sockets
**ss** replaces netstat: **-t** TCP, **-u** UDP, **-l** listening, **-n** numeric, **-p** show the owning process (root for all processes).
```[ss](/man/ss) -tulpn```
```[netstat](/man/netstat) -tuln```
```[lsof](/man/lsof) -i```
```[lsof](/man/lsof) -i :80```

## Routing
Show the routing table, and ask which route (and source address) would be used to reach a destination.
```[ip](/man/ip) route```
```[ip](/man/ip) route get 1.1.1.1```
```[route](/man/route) -n```

## Bandwidth Usage
Live traffic per connection (**iftop**), per process (**nethogs**), per interface (**nload**, **bmon**), and long-term statistics (**vnstat**).
```[iftop](/man/iftop)```
```[nethogs](/man/nethogs)```
```[nload](/man/nload)```
```[bmon](/man/bmon)```
```[vnstat](/man/vnstat)```

## Hostname
```[hostname](/man/hostname)```
```[hostnamectl](/man/hostnamectl)```
```[hostnamectl](/man/hostnamectl) set-hostname [newName]```
