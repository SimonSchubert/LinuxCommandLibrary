# TAGLINE

Create a new Vagrantfile configuration

# TLDR

**Initialize with default box**

```vagrant init```

**Initialize with specific box**

```vagrant init [box_name]```

**Initialize with minimal Vagrantfile**

```vagrant init -m [box_name]```

**Initialize with box URL**

```vagrant init [name] [url]```

# SYNOPSIS

**vagrant** **init** [_options_] [_name_] [_url_]

# PARAMETERS

**-m**, **--minimal**
> Create minimal Vagrantfile.

**-f**, **--force**
> Overwrite existing Vagrantfile.

**--box-version** _version_
> Specify box version.

**-o**, **--output** _file_
> Output file path.

# DESCRIPTION

**vagrant init** creates a new Vagrantfile in the current directory. The Vagrantfile defines VM configuration including box, networking, and provisioning. Start of every Vagrant project.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-up](/man/vagrant-up)(1), [vagrant-box](/man/vagrant-box)(1)

