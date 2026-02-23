# TAGLINE

Dynamic function call tracer using Frida

# TLDR

**Trace** functions matching a pattern in a process

```frida-trace -i "[pattern]" [process_name]```

**Trace** all functions in a specific **module**

```frida-trace -I "[module]" [process_name]```

**Trace Objective-C** methods matching a pattern

```frida-trace -m "[pattern]" [process_name]```

**Trace Java** methods on an Android device

```frida-trace -U -f [com.example.app] -j "[pattern]"```

**Spawn** a program and trace its **imports**

```frida-trace -T -f [/path/to/binary]```

**Trace** a function at a specific **offset** in a stripped binary

```frida-trace -p [pid] -a "[module]![0xoffset]"```

**Trace** functions on a **USB-connected** device with module decoration

```frida-trace -U --decorate -i "[pattern]" [app_name]```

# SYNOPSIS

**frida-trace** [_options_] [_target_]

# PARAMETERS

**-i** _FUNCTION_, **--include** _FUNCTION_
> Include [MODULE!]FUNCTION (glob pattern)

**-x** _FUNCTION_, **--exclude** _FUNCTION_
> Exclude [MODULE!]FUNCTION (glob pattern)

**-I** _MODULE_, **--include-module** _MODULE_
> Include all functions in MODULE (glob pattern)

**-X** _MODULE_, **--exclude-module** _MODULE_
> Exclude all functions in MODULE (glob pattern)

**-a** _MODULE!OFFSET_, **--add** _MODULE!OFFSET_
> Add function at OFFSET in MODULE (for stripped binaries)

**-T**, **--include-imports**
> Include the program's imports

**-t** _MODULE_, **--include-module-imports** _MODULE_
> Include MODULE's imports

**-m** _METHOD_, **--include-objc-method** _METHOD_
> Include Objective-C METHOD (glob pattern)

**-M** _METHOD_, **--exclude-objc-method** _METHOD_
> Exclude Objective-C METHOD (glob pattern)

**-y** _FUNC_, **--include-swift-func** _FUNC_
> Include Swift FUNC (glob pattern)

**-Y** _FUNC_, **--exclude-swift-func** _FUNC_
> Exclude Swift FUNC (glob pattern)

**-j** _METHOD_, **--include-java-method** _METHOD_
> Include Java METHOD (glob pattern)

**-J** _METHOD_, **--exclude-java-method** _METHOD_
> Exclude Java METHOD (glob pattern)

**-d**, **--decorate**
> Add module name to generated onEnter log statement

**-q**, **--quiet**
> Do not format output messages

**-o** _FILE_, **--output** _FILE_
> Dump messages to file

**-S** _PATH_, **--init-session** _PATH_
> Path to JavaScript file used to initialize session

**-f** _TARGET_, **--file** _TARGET_
> Spawn FILE as a new process

**-p** _PID_, **--attach-pid** _PID_
> Attach to process by PID

**-U**, **--usb**
> Connect to USB device

**-D** _ID_, **--device** _ID_
> Connect to device with the given ID

# DESCRIPTION

**frida-trace** is a tool for dynamically tracing function calls in running processes. It can hook **native functions** (C/C++), **Objective-C** methods, **Swift** functions, and **Java** methods, logging their invocation with arguments and return values.

When you trace a function, frida-trace auto-generates JavaScript handler stubs in a **\_\_handlers\_\_/** directory that you can customize to log arguments, modify return values, or implement arbitrary instrumentation logic. If a handler file already exists, it will not be overwritten.

The include (**-i**, **-I**) and exclude (**-x**, **-X**) options are procedural; each operates on the current working set of functions, so their order matters.

# CAVEATS

Tracing many functions with broad glob patterns (like **-i "\*"**) can severely slow down or freeze the target process. For stripped binaries without symbol information, you must use **-a MODULE!OFFSET** which requires prior knowledge of function offsets from static analysis tools like Ghidra or IDA Pro. The handler directory (**\_\_handlers\_\_/**) is created in the current working directory; existing handlers are not overwritten, which can cause confusion if tracing targets change. Root or elevated privileges are required for cross-process injection.

# HISTORY

**frida-trace** was one of the earliest tools built on top of the Frida core, included in the **frida-tools** package since Frida's public release in **2014**. Its function tracing capability leverages Frida's **Stalker** code tracing component. Over the years, support was added for Objective-C methods, Swift functions, and Java methods, reflecting the tool's evolution alongside the mobile security research community.

# SEE ALSO

[frida](/man/frida)(1), [frida-ps](/man/frida-ps)(1), [strace](/man/strace)(1), [ltrace](/man/ltrace)(1)
