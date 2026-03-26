# TAGLINE

Userspace NDIS driver loader for the ndiswrapper kernel module (version 1.9)

# TLDR

This is an internal support tool used by the ndiswrapper kernel module. It should not be invoked directly by users. Use **ndiswrapper** to manage NDIS drivers instead.

**Install a Windows driver using ndiswrapper instead**

```sudo ndiswrapper -i [path/to/driver.inf]```

**List installed NDIS drivers**

```ndiswrapper -l```

# SYNOPSIS

**loadndisdriver-1.9**

# DESCRIPTION

**loadndisdriver-1.9** is a version-specific support program for the **ndiswrapper** Linux kernel module. The ndiswrapper kernel module uses it to load Windows NDIS drivers that have been installed via the **ndiswrapper**(8) tool.

This tool should not be used directly. Its options are internal and subject to change. It expects to find NDIS driver files in the **/etc/ndiswrapper** directory.

# CAVEATS

Not intended for direct use. The ndiswrapper approach to wireless networking is largely deprecated in favor of native Linux drivers.

# SEE ALSO

[loadndisdriver](/man/loadndisdriver)(8), [ndiswrapper](/man/ndiswrapper)(8), [ndiswrapper-1.9](/man/ndiswrapper-1.9)(8)
