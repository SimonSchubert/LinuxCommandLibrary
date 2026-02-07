# TAGLINE

industry-standard container runtime daemon

# TLDR

**Start containerd** daemon

```sudo containerd```

**Start with a specific configuration** file

```sudo containerd --config [/etc/containerd/config.toml]```

**Start with debug logging**

```sudo containerd --log-level debug```

**Generate default configuration**

```containerd config default > [/etc/containerd/config.toml]```

**Check containerd version**

```containerd --version```

**Start with a specific root directory**

```sudo containerd --root [/var/lib/containerd]```

# SYNOPSIS

**containerd** [_options_]

# PARAMETERS

**--config** _FILE_
> Path to configuration file (default: /etc/containerd/config.toml).

**--root** _DIR_
> Root directory for containerd data.

**--state** _DIR_
> State directory for containerd.

**--address** _SOCKET_
> Address for containerd's gRPC socket.

**--log-level** _LEVEL_
> Logging level: trace, debug, info, warn, error, fatal, panic.

**config default**
> Output the default configuration to stdout.

**config dump**
> Output the current configuration.

**--version**
> Display version information.

**--help**
> Display help information.

# CONFIGURATION

**/etc/containerd/config.toml**
> Main configuration file for containerd daemon settings, runtime options, and plugin configurations.

# DESCRIPTION

**containerd** is an industry-standard container runtime that manages the complete container lifecycle on a host system. It handles image transfer and storage, container execution and supervision, low-level storage, and network attachments.

As a daemon, containerd provides a gRPC API for higher-level tools like Docker, Kubernetes, and nerdctl to interact with. It supports OCI (Open Container Initiative) images and runtime specifications, ensuring compatibility across the container ecosystem.

containerd is designed to be embedded into larger systems rather than used directly by end users. Kubernetes uses containerd as its container runtime through the CRI (Container Runtime Interface), and Docker uses it as its core runtime engine.

# CAVEATS

containerd is typically managed as a system service rather than run directly. Direct interaction requires tools like **ctr** or **nerdctl**. Proper configuration is essential for security, especially regarding runtime options and namespace isolation. Root privileges are required for most operations.

# HISTORY

containerd was originally developed as part of Docker and was spun out as an independent project in **December 2016**. It was donated to the Cloud Native Computing Foundation (CNCF) in **2017** and graduated as a CNCF project in **2019**, becoming the standard container runtime for Kubernetes.

# SEE ALSO

[ctr](/man/ctr)(1), [nerdctl](/man/nerdctl)(1), [docker](/man/docker)(1), [runc](/man/runc)(1)
