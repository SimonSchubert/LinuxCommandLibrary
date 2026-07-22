# TAGLINE

Cross-platform CPU sampling profiler with Firefox Profiler output

# TLDR

**Profile a command** and open the result in the browser

```samply record [path/to/command] [arg1] [arg2]```

**Set the sampling rate** in hertz

```samply record --rate [1000] [path/to/command]```

**Record without opening** the browser, saving to a file

```samply record --save-only --output [profile.json] -- [path/to/command]```

**Load a previously saved** profile

```samply load [path/to/profile.json]```

**Import** a profile from another profiler

```samply import [path/to/perf.data]```

**Profile a running process** by PID (macOS/Linux)

```samply record --pid [12345]```

**Attach to all processes** on the system (Linux/Windows)

```samply record -a```

# SYNOPSIS

**samply**  _command_  [_options_]  [**--**]  [_program_]  [_args_ ...]

# COMMANDS

**samply record** [_options_] **--** _command_ [_args_]
> Spawn _command_ and record a CPU profile of its execution. When the command exits, the profile opens in **profiler.firefox.com** by default.

**samply load** _profile_
> Open a previously saved profile in the Firefox Profiler.

**samply import** _file_
> Convert a profile from a foreign format (Linux **perf.data**, Xcode .trace, ETW, etc.) and open it in the Firefox Profiler.

**samply setup**
> On macOS, sign the **samply** binary so it can attach to existing processes.

# PARAMETERS

**--rate** _hz_
> Sampling frequency in samples per second. Default: _1000_.

**--duration** _seconds_
> Stop recording after _seconds_ of wall-clock time.

**--save-only**
> Do not open the browser; just write the profile to disk.

**-o**, **--output** _file_
> Path to the output profile (default: _profile.json.gz_).

**--profile-name** _name_
> Set the profile name shown in the Firefox Profiler UI.

**--port** _n_
> Port for the local symbol-server (default: _3000_).

**--no-open**
> Save the profile and start the local symbol-server, but do not launch a browser.

**--presymbolicate**
> Resolve symbols at save time and embed them in the profile, making it portable to machines without the original binaries.

**--pid** _pid_
> Profile an already-running process instead of spawning a new one.

**-a**, **--all**
> Profile every process on the system (system-wide profiling).

**--reuse-threads**
> Keep thread IDs stable across forks; useful for long-running daemons.

# DESCRIPTION

**samply** is a sampling profiler that runs on **macOS**, **Linux**, and **Windows** and produces profiles in the Firefox Profiler JSON format. It periodically interrupts the target process, captures one stack trace per thread, and writes the aggregated samples to disk; when recording finishes, **samply** starts a tiny local web server, opens **profiler.firefox.com** in your default browser, and the profiler fetches the data and symbols from that server.

On macOS and Windows, **samply** reports both on-CPU and off-CPU samples, so blocking on disk, network, or locks is visible in the flame graph. On Linux it currently reports on-CPU samples only, using the kernel's **perf_event_open** subsystem (no kernel module or LD_PRELOAD is required).

The output is the same JSON format used by Firefox's built-in profiler, so the resulting flame graphs, marker chains, call trees, stack charts, and source views all work out of the box, including across machines: profiles can be shared by uploading them to the public Firefox Profiler instance or by exchanging the JSON file directly.

# CAVEATS

On **Linux**, **samply** needs access to performance events. If **/proc/sys/kernel/perf_event_paranoid** is greater than _1_, recording will fail with "permission denied". Lower it temporarily:

```echo 1 | sudo tee /proc/sys/kernel/perf_event_paranoid```

or persistently via _sysctl kernel.perf_event_paranoid=1_.

On **macOS**, code-signing prevents attaching to existing processes by default. Run **samply setup** once to self-sign the binary, after which **--pid** works.

Symbols are resolved on demand by the local web server **samply** starts; if you close the terminal session, the profile in the browser loses access to symbols. Use **--presymbolicate** to embed them.

# HISTORY

**samply** was created in **2021** by **Markus Stange** at **Mozilla** to give external developers access to the same profile format that the **Gecko Profiler** had been producing for Firefox since **2011**. The project lives at _github.com/mstange/samply_ and is released under MIT or Apache-2.0.

# INSTALL

```pacman: sudo pacman -S samply```

```zypper: sudo zypper install samply```

```brew: brew install samply```

```nix: nix profile install nixpkgs#samply```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[perf](/man/perf)(1), [strace](/man/strace)(1), [gprof](/man/gprof)(1), [valgrind](/man/valgrind)(1), [hyperfine](/man/hyperfine)(1)
