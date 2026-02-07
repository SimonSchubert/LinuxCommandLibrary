# TAGLINE

system fact gathering tool for Puppet

# TLDR

**Show all facts**

```facter```

**Show specific fact**

```facter [os.family]```

**Show facts in JSON**

```facter --json```

**Show facts in YAML**

```facter --yaml```

**List all fact names**

```facter --list```

**Show timing information**

```facter --timing```

**Debug output**

```facter --debug```

# SYNOPSIS

**facter** [_options_] [_fact_...]

# PARAMETERS

**--json**
> Output in JSON format.

**--yaml**
> Output in YAML format.

**--list**
> List all fact names.

**--timing**
> Show timing for each fact.

**--debug**
> Debug output.

**--no-custom-facts**
> Disable custom facts.

**--external-dir** _dir_
> Directory for external facts.

**--puppet**
> Load Puppet's settings.

**-p**
> Include Puppet facts.

# CONFIGURATION

**/etc/facter/facts.d/**
> Custom external facts directory for system-wide facts.

**/opt/puppetlabs/facter/facts.d/**
> Puppet-specific custom facts directory.

**~/.facter/facts.d/**
> User-specific custom facts directory.

# DESCRIPTION

**facter** collects and displays system facts - information about the operating system, hardware, network, and other system properties. It's a core component of Puppet, providing data for configuration management.

Facts include OS details, IP addresses, memory, processors, disk space, and more. Custom facts can be written in Ruby or as executable external facts.

# COMMON FACTS

```
facter os.name           # Operating system
facter os.release.full   # OS version
facter networking.ip     # IP address
facter memory.total      # Total memory
facter processors.count  # CPU count
facter virtual           # Virtualization
```

# CAVEATS

Some facts require root privileges. Custom facts may slow collection. Facts may differ between facter versions. Puppet-specific facts need --puppet flag.

# HISTORY

Facter was created by **Luke Kanies** as part of the Puppet project at **Puppet Labs** (now Puppet) in the mid-**2000s**. Facter 3, a rewrite in C++ (later Ruby again), was released in **2015** for improved performance.

# SEE ALSO

[puppet](/man/puppet)(8), [ohai](/man/ohai)(1), [ansible](/man/ansible)(1)
