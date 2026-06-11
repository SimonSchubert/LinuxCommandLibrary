# TAGLINE

Run OSS applications using ALSA emulation

# TLDR

**Run an application with ALSA OSS emulation**

```aoss [application]```

**Run a game that requires OSS audio**

```aoss [game_binary]```

**Choose the ALSA PCM device** the OSS /dev/dsp maps to

```ALSA_OSS_PCM_DEVICE=[plughw:0,0] aoss [application]```

# SYNOPSIS

**aoss** _osscommand_ [_arguments_]

# DESCRIPTION

**aoss** is a wrapper script that enables applications written for the Open Sound System (OSS) API to work with ALSA (Advanced Linux Sound Architecture). It preloads a compatibility library that intercepts OSS system calls and translates them to ALSA equivalents.

Many older Linux applications and games were written to use the OSS **/dev/dsp** and **/dev/mixer** device interfaces. Since modern Linux systems primarily use ALSA, these applications would fail to produce sound without a compatibility layer. The aoss wrapper provides this translation transparently.

The wrapper sets the **LD_PRELOAD** environment variable to load **libaoss.so**, which hooks into the application's file operations on OSS device nodes and redirects them through ALSA's PCM interface. The PCM device to open can be set explicitly with the **ALSA_OSS_PCM_DEVICE** environment variable, overriding the default (dsp0).

# CAVEATS

Does not work with statically linked applications or applications that directly use kernel interfaces. Some complex OSS features may not be fully emulated. 32-bit applications on 64-bit systems require the 32-bit version of the ALSA OSS library. Applications using ALSA natively do not need this wrapper.

# HISTORY

The aoss wrapper was developed as part of the **alsa-oss** package to ease the transition from OSS to ALSA during the **early 2000s**. OSS was the original Linux sound system but was largely replaced by ALSA, which became the standard in Linux kernel 2.6. The wrapper remains useful for running legacy applications that were never updated to use ALSA or PulseAudio.

# SEE ALSO

[padsp](/man/padsp)(1), [alsamixer](/man/alsamixer)(1), [aplay](/man/aplay)(1)

# RESOURCES

```[Source code](https://github.com/alsa-project/alsa-oss)```

```[Homepage](https://www.alsa-project.org/)```

<!-- verified: 2026-06-11 -->
