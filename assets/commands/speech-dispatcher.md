# TLDR

**Start speech-dispatcher** daemon

```speech-dispatcher```

**Start in debug mode**

```speech-dispatcher -D```

**Start with a specific communication method**

```speech-dispatcher -c [unix_socket|inet_socket]```

**Start with a custom configuration file**

```speech-dispatcher -C [path/to/speechd.conf]```

**Start with a specific port**

```speech-dispatcher -p [6560]```

# SYNOPSIS

**speech-dispatcher** [_options_]

# PARAMETERS

**-d**, **--spawn**
> Start as a daemon (background process).

**-D**, **--debug**
> Enable debug mode with verbose output.

**-l**, **--log-level** _level_
> Set logging level (1-5, higher is more verbose).

**-c**, **--communication-method** _method_
> Communication method: **unix_socket** or **inet_socket**.

**-S**, **--socket-path** _path_
> Socket path for unix_socket method.

**-p**, **--port** _port_
> Port number for inet_socket method (default: 6560).

**-a**, **--address** _address_
> Network address to listen on.

**-C**, **--config-file** _path_
> Use a custom configuration file.

**-P**, **--pid-file** _path_
> PID file location.

**-m**, **--module-dir** _path_
> Directory for output modules.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**speech-dispatcher** is a server daemon that manages text-to-speech output on Linux systems. It provides a unified interface for applications to request speech synthesis, handling concurrent requests based on priority levels and abstracting different speech synthesizer backends.

The daemon listens for client connections and dispatches text to configured speech synthesis modules such as eSpeak NG, Festival, Piper, or others. It supports features like adjustable speech rate, pitch, volume, voice selection, and multiple languages.

Applications communicate with speech-dispatcher through client libraries (libspeechd) or the **spd-say** command-line utility. User-specific configuration is stored in **~/.config/speech-dispatcher/** while system configuration resides in **/etc/speech-dispatcher/**.

# CAVEATS

The daemon must be running for clients like **spd-say** to work. At least one speech synthesis backend (output module) must be configured. Audio system compatibility depends on the configured output modules. Running multiple instances requires different socket paths or ports.

# HISTORY

**Speech Dispatcher** was created to provide a unified text-to-speech interface for Linux accessibility and desktop applications. It was designed to work with screen readers and other assistive technologies. The project is developed as part of the Free(b)soft project for accessibility on free operating systems. Development continues with support for new synthesizers and audio systems.

# SEE ALSO

[spd-say](/man/spd-say)(1), [spd-conf](/man/spd-conf)(1), [espeak-ng](/man/espeak-ng)(1), [festival](/man/festival)(1)
