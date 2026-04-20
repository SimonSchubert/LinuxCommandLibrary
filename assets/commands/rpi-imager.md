# TAGLINE

Write OS images to SD cards and USB drives for Raspberry Pi

# TLDR

**Launch the GUI**

```rpi-imager```

**Write an image in headless CLI mode**

```rpi-imager --cli [image.img] [/dev/sdX]```

**Write and verify against a known SHA-256**

```rpi-imager --cli --sha256 [hash] [image.img] [/dev/sdX]```

**Write without verification (faster, no integrity check)**

```rpi-imager --cli --disable-verify [image.img] [/dev/sdX]```

**Quiet CLI mode** (suitable for scripts)

```rpi-imager --cli --quiet [image.img] [/dev/sdX]```

**Use a custom OS list repository**

```rpi-imager --repo [https://your-host/os-list.json]```

**Disable telemetry**

```rpi-imager --disable-telemetry```

# SYNOPSIS

**rpi-imager** [**--cli**] [_options_] [_image_] [_device_]

# PARAMETERS

**--cli**
> Command-line mode — no GUI is shown.

**--debug**
> Verbose debug output; on Windows a console window is attached.

**--version**
> Print the application version and exit.

**--repo** _URL_
> Load the OS list from a custom URL or local file path.

**--qm** _FILE_
> Load a custom Qt `.qm` translation file.

**--refresh-interval** _MIN_
> Seconds between OS-list refreshes (minimum 1440 minutes when non-zero).

**--refresh-jitter** _MIN_
> Jitter added to the refresh interval (minimum 180 minutes when non-zero).

**--disable-telemetry**, **--enable-telemetry**
> Turn off or restore telemetry. The setting is persisted.

**--disable-verify**
> CLI only. Skip the post-write re-read verification pass.

**--sha256** _HASH_
> CLI only. Verify the written data matches the given SHA-256.

**--quiet**
> CLI only. Suppress progress output.

**--help**
> Display usage information.

# DESCRIPTION

**rpi-imager** is the official Raspberry Pi imaging tool for writing operating-system images onto SD cards and USB drives. The GUI handles image discovery, download, and first-boot customization (hostname, SSH, Wi-Fi, locale, timezone, user account). The **--cli** mode is a scripting interface: it writes a single image to a single device and verifies the result. Customization options such as hostname and Wi-Fi are only exposed in the GUI — they are not CLI flags.

The tool downloads and caches official and third-party images from a JSON list, verifies the download by checksum, and re-reads the device after writing to detect silently failing SD cards.

# CAVEATS

Writing requires root/admin privileges on the target device; selecting the wrong device destroys data — verify the path twice. Preseeding SSH/Wi-Fi from a script requires the GUI (which writes a cloud-init-style `firstrun` payload) or a separate tool such as `systemd-firstboot`.

# HISTORY

**rpi-imager** was released by **Raspberry Pi Ltd** in **March 2020** to replace third-party imaging tools. The **--cli** mode, SHA-256 verification, and telemetry controls were added in subsequent releases.

# SEE ALSO

[dd](/man/dd)(1), [balena-etcher](/man/balena-etcher)(1), [gnome-disks](/man/gnome-disks)(1)
