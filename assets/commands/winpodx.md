# TAGLINE

Run Windows apps on Linux as native windows

# TLDR

**Start the Windows pod** and wait until RDP is ready

```winpodx pod start --wait```

**List available Windows applications** detected inside the pod

```winpodx app list```

**Launch a registered application** (e.g. Microsoft Word)

```winpodx app run [app_name]```

**Open a local file** with a Windows application

```winpodx app run [app_name] [path/to/file]```

**Launch the full Windows desktop** as a single RDP window

```winpodx app run desktop```

**Open the Qt6 graphical interface**

```winpodx gui```

**Stop the pod** when finished

```winpodx pod stop```

**Run the interactive setup wizard**

```winpodx setup```

# SYNOPSIS

**winpodx** _domain_ _command_ [_arguments_] [**--flags**]

# PARAMETERS

**app list**
> Show every Windows application detected inside the pod.

**app run** _name_ [_file_]
> Launch the named application as a RemoteApp window. An optional file is opened with that application.

**app install** _name_
> Register a custom application in the desktop launcher menu.

**app install-all**
> Register every detected application as a desktop launcher entry.

**app sessions**
> List active RemoteApp sessions.

**app kill** _name_
> Terminate a running RemoteApp session.

**app refresh**
> Rescan the Windows guest for newly installed applications.

**pod start** [**--wait**]
> Start the Windows container. **--wait** blocks until RDP is reachable.

**pod stop**
> Stop the Windows container.

**pod restart**
> Restart the Windows container.

**pod status**
> Print container, RDP, and agent state.

**pod wait-ready** [**--logs**]
> Block until the first-boot Sysprep / OEM phase finishes. **--logs** streams progress.

**pod apply-fixes**
> Reapply Windows-side configuration tweaks (registry, services, defaults).

**pod sync-password**
> Synchronise the RDP password between **winpodx.toml** and the Windows guest.

**pod multi-session** {_on_|_off_|_status_}
> Toggle bundled rdprrap multi-session support.

**power --suspend**
> Pause the running container.

**power --resume**
> Resume a paused container.

**rotate-password**
> Generate and apply a new RDP password.

**setup**
> Run the interactive first-time configuration wizard.

**check** [**--json**]
> Run health probes (pod, RDP, agent, round-trip, disk) and print results.

**info**
> Print system diagnostics (versions, paths, dependencies).

**cleanup**
> Remove stale Office lock files in the guest.

**timesync**
> Force a time synchronisation in the Windows guest.

**debloat**
> Disable telemetry and unneeded services in the guest.

**config show**
> Print the current configuration.

**config set** _key_ _value_
> Update a configuration key (e.g. **rdp.scale 140**).

**config import**
> Import settings from an existing **winapps.conf**.

**gui**
> Launch the Qt6 main window.

**tray**
> Launch the system tray icon.

# DESCRIPTION

**winpodx** runs a Windows guest inside a Podman or Docker container and presents individual Windows applications as native Linux windows through **FreeRDP** RemoteApp. Each app gets its own pinnable, alt-tabbable window with the original icon and file association, without exposing the underlying Windows desktop.

A small HTTP agent inside the guest receives bearer-authenticated commands from the host so app launches do not flash a PowerShell window. Application discovery, password rotation, multi-session, and health checks are all driven from the **winpodx** CLI; a Qt6 GUI provides the same actions plus an allowlisted in-app terminal.

**winpodx** targets Linux only. The first run downloads a Windows ISO, runs Sysprep, and applies an OEM customisation pass; expect five to ten minutes before the pod is usable.

# CONFIGURATION

The configuration file lives at _~/.config/winpodx/winpodx.toml_ and is editable through **winpodx config set**:

```
[pod]
backend = "podman"        # or "docker"
cpus = 4
ram = "8G"
auto_start = true
idle_timeout = "30m"

[rdp]
host = "127.0.0.1"
port = 3389
scale = 100
dpi = 96
user = "winpodx"
password_rotation_days = 7

[agent]
port = 8765
token = "<generated>"
```

Environment variables read at start:

```
WINPODX_CONFIG       Override config file path
WINPODX_LOG_LEVEL    debug | info | warn | error
```

# CAVEATS

Requires a working Podman or Docker installation, a usable KVM accelerator, and a recent **FreeRDP 3** build with RemoteApp support. The first boot performs a full Windows install plus Sysprep; do not interrupt **winpodx pod wait-ready**. Microsoft Windows itself remains subject to its own licensing terms and is **not redistributed** by winpodx; the user supplies a valid Windows installation. The guest agent listens on **localhost:8765** with a bearer token; do not expose this port to other hosts.

# HISTORY

**winpodx** is a Python 3.9+ project that pairs the **dockur/windows** container image with **FreeRDP** RemoteApp and a custom PowerShell HTTP guest agent. It targets the same use case as **WinApps** but ships container, agent, and GUI as a single tool rather than relying on a manually configured VM. Active development continues on the **kernalix7/winpodx** repository.

# INSTALL

```aur: yay -S winpodx```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [xfreerdp](/man/xfreerdp)(1), [virsh](/man/virsh)(1), [wine](/man/wine)(1)
