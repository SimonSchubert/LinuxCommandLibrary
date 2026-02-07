# TAGLINE

DOS emulator for classic games and applications

# TLDR

**Start DOSBox** with a mounted directory

```dosbox -c "mount c [/path/to/games]"```

**Run a DOS program directly**

```dosbox [path/to/program.exe]```

**Start DOSBox with a specific configuration**

```dosbox -conf [path/to/dosbox.conf]```

**Start in fullscreen mode**

```dosbox -fullscreen```

**Exit after running a program**

```dosbox [program.exe] -exit```

**Start with specific CPU cycles**

```dosbox -c "cycles [max]"```

**Mount a CD-ROM image**

```dosbox -c "imgmount d [path/to/image.iso] -t cdrom"```

**Run a batch file at startup**

```dosbox -c "mount c ." -c "c:" -c "[autoexec.bat]"```

# SYNOPSIS

**dosbox** [_-conf config_] [_-c command_] [_-fullscreen_] [_-exit_] [_program_] [_arguments_]

# PARAMETERS

**-conf** _file_
> Load the specified configuration file.

**-c** _command_
> Execute a DOS command after startup. Can be specified multiple times.

**-fullscreen**
> Start in fullscreen mode.

**-exit**
> Exit DOSBox when the program terminates.

**-machine** _type_
> Emulate a specific machine type (hercules, cga, tandy, pcjr, ega, vga, svga_s3).

**-noconsole**
> Start without the console window (Windows only).

**-startmapper**
> Start the keymapper immediately.

**-noautoexec**
> Skip the [autoexec] section in the config file.

**-userconf**
> Load user configuration file.

**-version**
> Print version information.

**-lang** _file_
> Use the specified language file.

# DESCRIPTION

**DOSBox** is an emulator that recreates an IBM PC compatible computer with DOS. It allows running classic DOS games and applications on modern operating systems by emulating the x86 CPU, graphics, sound, and input hardware from that era.

The emulator provides a command prompt where standard DOS commands work: **dir**, **cd**, **copy**, etc. Host directories are accessed by mounting them as virtual drives. The **mount c /path/to/folder** command makes a folder appear as drive C: inside DOSBox.

Configuration files control emulation settings including CPU speed (cycles), graphics rendering, sound card emulation (Sound Blaster, AdLib, etc.), and memory allocation. The default configuration file is in **~/.dosbox/** on Linux or the user profile on Windows.

Key mappings can be customized with the built-in keymapper (Ctrl+F1). Common controls include Alt+Enter for fullscreen toggle, Ctrl+F10 to release mouse capture, and Ctrl+F12/F11 to adjust CPU speed. DOSBox can mount disk images (ISO, CUE/BIN) for games requiring CD-ROMs.

# CONFIGURATION

**~/.dosbox/dosbox-*.conf**
> Primary configuration file controlling CPU, graphics, sound, and autoexec settings.

**/etc/dosbox.conf**
> System-wide configuration file (Linux).

# CAVEATS

Not all DOS software is compatible; very old or very demanding programs may not work correctly. CPU cycle settings may need adjustment for proper game speed. Some copy protection schemes may not work. DOSBox is designed for gaming, not running DOS as a primary operating system.

# HISTORY

**DOSBox** was started by Peter Veenstra and Sjoerd van der Berg in **2002** to run old DOS games on modern systems. It became one of the most popular DOS emulators, supporting Windows, Linux, macOS, and other platforms. Active development continued through various versions, with DOSBox Staging and DOSBox-X emerging as enhanced forks with additional features.

# SEE ALSO

[dosemu](/man/dosemu)(1), [qemu](/man/qemu)(1), [wine](/man/wine)(1), [86box](/man/86box)(1)
