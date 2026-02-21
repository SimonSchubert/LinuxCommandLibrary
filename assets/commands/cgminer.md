# TAGLINE

multi-threaded cryptocurrency miner for ASIC devices

# TLDR

**Mine Bitcoin** using a pool with username and password

```cgminer -o [stratum+tcp://pool:port] -u [username] -p [password]```

**Solo mine** to a local Bitcoin node

```cgminer -o [http://localhost:8332] -u [rpcuser] -p [rpcpassword] --btc-address [your_address]```

**Run in benchmark mode** without submitting shares

```cgminer --benchmark```

**Enable the API** on a specific port

```cgminer -o [stratum+tcp://pool:port] -u [username] -p [password] --api-listen --api-port [4028]```

**Load configuration from file**

```cgminer -c [path/to/config.json]```

**Mine with multiple pools** using load balancing

```cgminer -o [pool1:port] -u [user1] -p [pass1] -o [pool2:port] -u [user2] -p [pass2] --load-balance```

# SYNOPSIS

**cgminer** [_-DdlmpPqUTouOchnV_] [_-o url_] [_-u user_] [_-p pass_]

# PARAMETERS

**-o**, **--url** _URL_
> URL for bitcoin JSON-RPC server (pool or local node)

**-u**, **--user** _USERNAME_
> Username for JSON-RPC server

**-p**, **--pass** _PASSWORD_
> Password for JSON-RPC server

**-O**, **--userpass** _USER:PASS_
> Username:password pair for server

**-c**, **--config** _FILE_
> Load a JSON-formatted configuration file

**--benchmark**
> Run in benchmark mode producing no actual shares

**--shares** _NUMBER_
> Quit after mining the specified number of shares

**--no-submit-stale**
> Do not submit shares if they are detected as stale

**--btc-address** _ADDRESS_
> Bitcoin address for solo mining coinbase rewards

**--balance**
> Change pool strategy to even share balance

**--load-balance**
> Change pool strategy to quota based balance

**--rotate** _MINUTES_
> Rotate between pools every N minutes

**--failover-only**
> Do not leak work to backup pools when primary is active

**--api-listen**
> Enable the miner API (disabled by default)

**--api-port** _PORT_
> Port number for API (default: 4028)

**--api-allow** _[G:]IP[/PREFIX]_
> Allow API access only to the given addresses

**-D**, **--debug**
> Enable debug output

**-l**, **--log** _INTERVAL_
> Interval in seconds between log output (default: 5)

**-q**, **--quiet**
> Disable logging output, display status and errors only

**-T**, **--text-only**
> Disable ncurses formatted screen output

**--temp-cutoff** _TEMP_
> Temperature where devices will be disabled

**--usb** _DEVICES_
> USB device selection (e.g., 1:2,1:3 or BAS:1,BFL:1)

**-h**, **--help**
> Print help message and exit

**-V**, **--version**
> Display version and exit

# DESCRIPTION

**cgminer** is a multi-threaded multi-pool miner for Bitcoin and other SHA256d cryptocurrencies. Originally supporting CPU, GPU, FPGA, and ASIC mining, modern versions focus exclusively on ASIC devices as GPU mining is no longer economically viable for Bitcoin.

The miner supports multiple pools with configurable failover, load-balancing, and rotation strategies. It connects using the stratum protocol or JSON-RPC and submits proof-of-work solutions. The built-in API allows remote monitoring and control of mining operations.

CGMiner supports various ASIC hardware including Avalon, AntMiner, BitFury, Cointerra, Drillbit, HashFast, Icarus, and Klondike devices. On Linux, direct USB support requires no additional drivers, though udev rules may be needed for non-root access.

# CONFIGURATION

**cgminer.conf**
> JSON configuration file with pool URLs, credentials, device settings, and mining parameters. Loaded with -c flag or auto-loaded from the working directory.

# CAVEATS

GPU mining support has been removed in recent versions as it is no longer profitable for Bitcoin. On Linux, USB device permissions may require adding the user to the **plugdev** group or installing udev rules from the cgminer distribution. High hash rates generate significant heat and power consumption. Pool URLs must use the correct protocol prefix (**http://** for solo mining, **stratum+tcp://** for pool mining).

# HISTORY

CGMiner was created by **Con Kolivas** (ckolivas) and first released in **2011**. It began as a fork of the CPU miner **cpuminer** by Jeff Garzik. The name stands for **Con's GPU Miner**, though it later expanded to support FPGAs and ASICs. It became one of the most widely used Bitcoin mining programs during the GPU and early ASIC mining eras. BFGMiner was later forked from CGMiner in 2012 with a focus on FPGA/ASIC modularity.

# SEE ALSO

[bfgminer](/man/bfgminer)(1), [minerd](/man/minerd)(1), [xmrig](/man/xmrig)(1)
