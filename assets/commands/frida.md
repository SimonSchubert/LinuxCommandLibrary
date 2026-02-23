# TAGLINE

Dynamic instrumentation toolkit for developers and security researchers

# TLDR

**Attach** to a running process by name

```frida [process_name]```

**Attach** to a process by **PID**

```frida -p [pid]```

**Spawn** a new process and instrument it

```frida -f [/path/to/binary]```

**Load** a JavaScript instrumentation script

```frida -l [script.js] [process_name]```

**Attach** to an app on a **USB-connected** device

```frida -U -n [app_name]```

**Spawn** an app on a USB device and **pause** the main thread

```frida -U -f [com.example.app] --pause```

**Evaluate** inline JavaScript code against a process

```frida -e "console.log('hello')" [process_name]```

# SYNOPSIS

**frida** [_options_] [_target_]

# PARAMETERS

**-f** _TARGET_, **--file** _TARGET_
> Spawn FILE as a new process

**-F**, **--attach-frontmost**
> Attach to the frontmost application

**-n** _NAME_, **--attach-name** _NAME_
> Attach to process by name

**-p** _PID_, **--attach-pid** _PID_
> Attach to process by PID

**-U**, **--usb**
> Connect to USB device

**-R**, **--remote**
> Connect to remote frida-server

**-H** _HOST_, **--host** _HOST_
> Connect to remote frida-server on HOST

**-D** _ID_, **--device** _ID_
> Connect to device with the given ID

**-l** _SCRIPT_, **--load** _SCRIPT_
> Load JavaScript SCRIPT (may be specified multiple times)

**-e** _CODE_, **--eval** _CODE_
> Evaluate JavaScript CODE

**-c** _URI_, **--codeshare** _URI_
> Load script from Frida CodeShare

**-C** _CMODULE_, **--cmodule** _CMODULE_
> Load a C module

**-P** _JSON_, **--parameters** _JSON_
> Parameters as JSON, same as Gadget

**--runtime** {**qjs**,**v8**}
> Script runtime to use

**--debug**
> Enable Node.js compatible script debugger

**-q**, **--quiet**
> Quiet mode (no prompt), quit after -l and -e

**-t** _SECS_, **--timeout** _SECS_
> Seconds to wait before terminating in quiet mode

**-o** _FILE_, **--output** _FILE_
> Output to log file

**--pause**
> Leave main thread paused after spawning program

**--kill-on-exit**
> Kill the spawned program when Frida exits

**--eternalize**
> Eternalize the script before exit

**--auto-perform**
> Wrap entered code with Java.perform

**--no-auto-reload**
> Disable auto reload of scripts on file change

# DESCRIPTION

**frida** is the interactive REPL (Read-Eval-Print Loop) interface to the Frida dynamic instrumentation toolkit. It allows injecting JavaScript snippets into running processes for runtime analysis, debugging, and modification. You can attach to running processes, spawn new ones, load scripts, hook functions, and inspect or modify application behavior at runtime.

Frida works across **Windows**, **macOS**, **GNU/Linux**, **iOS**, **Android**, **FreeBSD**, and **QNX**. For remote targets (phones, embedded devices), a **frida-server** binary must be running on the target device.

# CAVEATS

Injecting into other processes typically requires **root** or elevated privileges. On Android, frida-server must run as root. On iOS, a jailbreak is typically needed. Many applications (especially mobile banking and DRM-protected apps) implement Frida detection mechanisms and may terminate when instrumentation is detected. Bugs in injected scripts can crash the target process. Frida should only be used on software you own or have explicit authorization to test.

# HISTORY

Frida was created by **Ole Andre Vadla Ravnas** who began building a generic code instrumentation library in C around **2008**. The project was publicly released in **2014**, with Frida 1.6.0 (May 2014) adding Android support. The project is sponsored by **NowSecure**. Today Frida supports bindings for Node.js, Python, Swift, .NET, Go, and C, and is a standard tool referenced in the **OWASP Mobile Security Testing Guide**.

# SEE ALSO

[frida-ps](/man/frida-ps)(1), [frida-trace](/man/frida-trace)(1), [gdb](/man/gdb)(1), [strace](/man/strace)(1)
