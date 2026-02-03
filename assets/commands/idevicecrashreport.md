# TLDR

**Download crash reports**

```idevicecrashreport [output-dir]```

**Download and delete from device**

```idevicecrashreport -m [output-dir]```

**Keep reports on device**

```idevicecrashreport -k [output-dir]```

**Extract specific crash**

```idevicecrashreport -e [crash-name] [output-dir]```

# SYNOPSIS

**idevicecrashreport** [_options_] _directory_

# PARAMETERS

**-u** _udid_
> Target specific device.

**-m**
> Move (delete after copy).

**-k**
> Keep reports on device.

**-e** _name_
> Extract specific report.

**-n**
> Connect over network.

# DESCRIPTION

**idevicecrashreport** retrieves crash reports from iOS devices. Part of the libimobiledevice suite. Downloads .crash, .ips, and related diagnostic files. Useful for debugging app crashes without iTunes or Xcode.

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1), [idevicediagnostics](/man/idevicediagnostics)(1)

