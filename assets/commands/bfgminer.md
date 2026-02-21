# TAGLINE

modular multi-threaded Bitcoin miner

# TLDR

**Mine Bitcoin** using a pool with username and password

```bfgminer -o [stratum+tcp://pool:port] -u [username] -p [password]```

**Mine using a specific device**

```bfgminer -o [stratum+tcp://pool:port] -u [username] -p [password] -d [device]```

**Mine with scrypt algorithm** (Litecoin, Dogecoin, etc.)

```bfgminer --scrypt -o [stratum+tcp://pool:port] -u [username] -p [password]```

**Set GPU intensity** for mining

```bfgminer -o [stratum+tcp://pool:port] -u [username] -p [password] -I [10]```

**Enable the API** on a specific port

```bfgminer -o [stratum+tcp://pool:port] -u [username] -p [password] --api-listen --api-port [4028]```

**Load configuration from file**

```bfgminer -c [path/to/config.json]```

# SYNOPSIS

**bfgminer** [_-DdEgIKklLmpPQqUSsTouvwOchV_] [_-o url_] [_-u user_] [_-p pass_]

# PARAMETERS

**-o**, **--url** _URL_
> URL for bitcoin JSON-RPC server (pool address)

**-u**, **--user** _USERNAME_
> Username for JSON-RPC server

**-p**, **--pass** _PASSWORD_
> Password for JSON-RPC server

**-O**, **--userpass** _USER:PASS_
> Username:password pair for server

**-d**, **--device** _PATTERN_
> Enable devices matching pattern (use -d? to list)

**-I**, **--intensity** _VALUE_
> Intensity of GPU scanning (-10 to 20, default: d for desktop interactivity)

**--scrypt**
> Use scrypt algorithm instead of SHA256d

**-c**, **--config** _FILE_
> Load a JSON-formatted configuration file

**-l**, **--log** _INTERVAL_
> Interval in seconds between log output

**-L**, **--log-file** _FILE_
> Append log output to this file

**-T**, **--text-only**
> Disable ncurses formatted screen output

**-q**, **--quiet**
> Disable logging output, display status and errors

**--api-listen**
> Enable API (default: disabled)

**--api-port** _PORT_
> Port for API (default: 4028)

**--api-allow** _[G:]IP[/PREFIX]_
> Allow API access only to specified addresses

**--failover-only**
> Do not leak work to backup pools in multi-pool setups

**-U**, **--quota** _VALUE_
> Load-balance quota for pool (e.g., 2:http://pool)

**--benchmark**
> Run in offline benchmark mode

**--shares** _NUMBER_
> Quit after mining specified number of shares

**-V**, **--version**
> Display version and exit

**-h**, **--help**
> Display help message and exit

# DESCRIPTION

**bfgminer** is a modular multi-threaded miner written in C, designed for mining Bitcoin and other SHA256d or scrypt-based cryptocurrencies. It supports a wide range of hardware including ASICs, FPGAs, GPUs, and CPUs.

The miner connects to mining pools using the stratum protocol or JSON-RPC and submits proof-of-work solutions. It features automatic detection and configuration of supported mining devices, dynamic clocking, monitoring, and fan speed control for compatible hardware.

BFGMiner provides a built-in API for remote monitoring and control, making it suitable for managing mining rigs. It supports multiple simultaneous pools with configurable failover and load-balancing strategies.

# CAVEATS

GPU mining for Bitcoin is no longer profitable due to the dominance of ASIC miners. BFGMiner's GPU support is primarily useful for scrypt-based coins or testing. The software requires appropriate drivers for your mining hardware. ASIC and FPGA devices may need specific firmware. Running mining software significantly increases power consumption and heat output.

# HISTORY

BFGMiner was forked from **CGMiner** in **2012** by Luke Dashjr to focus on FPGA and ASIC support while maintaining modularity. The name is a backronym for "**B**asically a **F**reaking **G**ood Miner." It became popular for its extensive hardware support and remote API capabilities. Development continues on GitHub with support for modern mining hardware.

# SEE ALSO

[cgminer](/man/cgminer)(1), [minerd](/man/minerd)(1), [xmrig](/man/xmrig)(1)
