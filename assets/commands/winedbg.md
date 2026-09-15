# TAGLINE

Debugger for Windows and Winelib programs running under Wine

# TLDR

Launch a program **under the debugger**

```winedbg [path/to/program.exe]```

**Attach** to a running Windows process by its Wine PID

```winedbg [process_id]```

Debug through a **gdb** front end

```winedbg --gdb [path/to/program.exe]```

Start a gdb proxy and **print the target remote command** instead of launching gdb

```winedbg --gdb --no-start [path/to/program.exe]```

Load and inspect a **minidump** crash file

```winedbg [path/to/crash.mdmp]```

Run a **one-shot debugger command** (for example list processes) and exit

```winedbg --command "info proc"```

# SYNOPSIS

**winedbg** [_options_] [_program_name_ [_program_arguments_] | _wpid_]

**winedbg --gdb** [_options_] [_program_name_ [_program_arguments_] | _wpid_]

**winedbg --auto** _wpid_

**winedbg --minidump** [_file.mdmp_] _wpid_

**winedbg** _file.mdmp_

# PARAMETERS

_program_name_
> Executable to start in a new debugging session. Extra arguments are passed to that process.

_wpid_
> Attach to the process whose Windows PID is _wpid_. List PIDs with **info proc** inside **winedbg**.

**--gdb**
> Run as a proxy so **gdb** (or another GDB-compatible front end) handles commands while **winedbg** translates them to Win32 debugging APIs.

**--auto**
> Crash-handler mode used when **winedbg** is registered as the AeDebug debugger. Prints basic crash information and does not take interactive input.

**--minidump** [_file.mdmp_]
> Like **--auto**, but writes a minidump instead of printing the report. If no file name is given, **winedbg** generates one.

**--command** _string_
> In default mode, execute _string_ as a debugger command and exit (for example **info proc**).

**--exec** _filename_
> Set the executable name without starting it.

**--file** _filename_
> Execute debugger commands from _filename_ and exit.

**--no-start**
> With **--gdb**, do not launch gdb. Print a **target remote localhost:**_port_ command and listen for any GDB-compatible debugger.

**--port** _port_
> With **--gdb**, bind the GDB proxy to _port_ instead of an OS-chosen port.

**--with-xterm**
> With **--gdb**, run the gdb front end in a new **xterm** window. Ignored if **--no-start** is set.

**--help**
> Display help.

# DESCRIPTION

**winedbg** is the Wine debugger. It can debug native Win32 applications and Winelib programs, and it can stand in for Dr Watson as a post-crash debugger.

In the default mode **winedbg** is the interactive front end. Commands are close to **gdb**: breakpoints (**break**, **watch**, **rwatch**), stepping (**step**, **next**, **cont**, **finish**), stack traces (**bt**), memory examination (**x**, **print**, **set**), and Wine-specific **info** queries (**info proc**, **info thread**, **info wnd**, **info share**, **info map**). Module-qualified symbols use a bang, for example **USER32!CreateWindowExA**.

**--gdb** starts a proxy debugging server and, unless **--no-start** is given, launches **gdb** as the front end. **--auto** and **--minidump** are non-interactive crash modes. Passing a **.mdmp** file reloads a saved debuggee state.

If neither a program nor a PID is given, **winedbg** starts with no target; use **run** or **attach** from the prompt.

# ENVIRONMENT

**WINE_GDB**
> Executable used as the gdb front end in **--gdb** mode. Default: **gdb**.

**WINEPREFIX**
> Wine prefix whose processes **winedbg** can see. Default: **~/.wine**.

# CAVEATS

The PID used with **attach** and on the command line is the Windows PID from **info proc**, not the host Unix PID. Breakpoints set by symbol name are deferred until the containing module loads. Re-running with **run** drops breakpoints from the previous process. The **--gdb** proxy exits after the first debugger disconnects. **--auto** and **--minidump** accept no interactive commands.

# HISTORY

The first **winedbg** was written by **Eric Youngdale**. It ships as part of **Wine**, which has provided a Windows API implementation on Unix since **1993**.

# INSTALL

```apk: sudo apk add wine-dev```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[wine](/man/wine)(1), [wineboot](/man/wineboot)(1), [wineserver](/man/wineserver)(1), [gdb](/man/gdb)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-15 -->
