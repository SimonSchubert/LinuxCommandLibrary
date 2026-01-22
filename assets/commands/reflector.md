# TLDR

Sort by **speed** and save

```sudo reflector --sort rate --save /etc/pacman.d/mirrorlist```

Get mirrors from **country** using **HTTPS**

```reflector -c [Germany] -p https```

Get **recently synced** mirrors

```reflector -l [10]```

Use **config file**

```sudo reflector @/etc/xdg/reflector/reflector.conf```

Display **help**

```reflector -h```

# SYNOPSIS

**reflector** [**-c** _country_] [**-p** _protocol_] [**-l** _num_] [**--sort** _method_] [**--save** _file_]

# PARAMETERS

**-c, --country _country_**
> Filter by country

**-p, --protocol _proto_**
> Filter by protocol (http, https, ftp)

**-l, --latest _num_**
> Get N most recently synced mirrors

**--sort _method_**
> Sort by: rate, country, score, delay

**--save _file_**
> Save output to file

**--age _hours_**
> Only mirrors synced within N hours

**-f, --fastest _num_**
> Return N fastest mirrors

# DESCRIPTION

**reflector** retrieves and filters the latest Arch Linux mirrorlist. It can test mirror speed and sort by various criteria, then save an optimized mirrorlist for pacman.

The tool is useful for finding fast, reliable mirrors for your location. It can be run periodically via systemd timer to keep the mirrorlist current.

# CAVEATS

Arch Linux specific. Speed tests take time. Network conditions vary. Consider running periodically for best results. Requires internet access.

# HISTORY

**reflector** was created for Arch Linux to automate mirror selection. It replaces manual editing of the mirrorlist with intelligent, automated selection based on speed and sync status.

# SEE ALSO

[pacman](/man/pacman)(8), [rankmirrors](/man/rankmirrors)(1), [pacman-mirrors](/man/pacman-mirrors)(1)
