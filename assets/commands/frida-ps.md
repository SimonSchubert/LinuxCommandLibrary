# TAGLINE

List processes on local and remote devices using Frida

# TLDR

**List** all processes on the local machine

```frida-ps```

**List** processes on a **USB-connected** device

```frida-ps -U```

**List** only running **applications** on a USB device

```frida-ps -Ua```

**List** all **installed** applications on a USB device (running or not)

```frida-ps -Uai```

**List** processes on a **specific device** by ID

```frida-ps -D [device_id]```

**Connect** to a remote frida-server on a specific **host**

```frida-ps -H [192.168.1.100]```

**Output** the installed applications as **JSON**

```frida-ps -Uai -j```

# SYNOPSIS

**frida-ps** [_options_]

# PARAMETERS

**-a**, **--applications**
> List only applications, not all system processes.

**-i**, **--installed**
> Include all installed applications (requires **-a**).

**-j**, **--json**
> Output results as JSON.

**-e**, **--exclude-icons**
> Exclude icons from the output.

**-U**, **--usb**
> Connect to USB device.

**-R**, **--remote**
> Connect to remote frida-server.

**-H** _HOST_, **--host** _HOST_
> Connect to remote frida-server on HOST.

**-D** _ID_, **--device** _ID_
> Connect to device with the given ID.

**--certificate** _CERTIFICATE_
> Speak TLS with HOST, expecting CERTIFICATE.

**--origin** _ORIGIN_
> Connect to remote server with Origin header set to ORIGIN.

**--token** _TOKEN_
> Authenticate with HOST using TOKEN.

**--keepalive-interval** _INTERVAL_
> Set keepalive interval in seconds, or 0 to disable.

**-O** _FILE_, **--options-file** _FILE_
> Text file containing additional command-line options.

**--version**
> Show the version number.

# DESCRIPTION

**frida-ps** is a command-line tool for listing processes, part of the Frida dynamic instrumentation toolkit. It functions similarly to the Unix **ps** command but is designed to work with both local and remote devices (USB-connected phones, remote frida-server instances). It can list all running processes or filter to only applications, including installed but not running ones.

# CAVEATS

To list processes on a remote or USB-connected device, **frida-server** must be running on that device with appropriate permissions. The **-i** flag requires **-a**; using **--installed** without **--applications** will report an error. On the local machine, listing processes of other users may require elevated privileges.

# HISTORY

**frida-ps** is included in the **frida-tools** package, installable via **pip install frida-tools**. Frida was created by **Ole Andre Vadla Ravnas** and publicly released in **2014**.

# INSTALL

```aur: yay -S frida-tools```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[frida](/man/frida)(1), [frida-trace](/man/frida-trace)(1), [ps](/man/ps)(1)

# RESOURCES

```[Source code](https://github.com/frida/frida-tools)```

```[Homepage](https://frida.re/)```

```[Documentation](https://frida.re/docs/frida-ps/)```

<!-- verified: 2026-11-09 -->
