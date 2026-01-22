# TLDR

**List** portable service images

```portablectl list```

**Attach** image to system

```portablectl attach [path/to/image]```

**Detach** image from system

```portablectl detach [image_name]```

**Inspect** image metadata

```portablectl inspect [path/to/image]```

Check if image is **attached**

```portablectl is-attached [image_name]```

# SYNOPSIS

**portablectl** [**list**|**attach**|**detach**|**inspect**|**is-attached**] [_options_] [_image_]

# COMMANDS

**list**
> List discovered portable service images

**attach**
> Attach image to system

**detach**
> Detach image from system

**inspect**
> Show image details and metadata

**is-attached**
> Check attachment status

**reattach**
> Detach and reattach image

# PARAMETERS

**--copy _mode_**
> Copy mode: auto, copy, symlink

**--profile _profile_**
> Use specific profile

**--now**
> Start/stop units immediately

**--enable**
> Enable units after attach

# DESCRIPTION

**portablectl** manages systemd portable service images. Portable services are a lightweight container alternative, bundling services with their dependencies in disk images that can be attached to running systems.

Images are self-contained and can include multiple services. They're useful for deploying applications without full containerization overhead.

# CAVEATS

Requires systemd 239+. Images must follow portable service format. Attachment requires root privileges. Profile controls sandboxing level.

# HISTORY

**portablectl** was introduced with **systemd portable services** as a lightweight containerization solution. It provides isolation benefits while maintaining tight integration with the systemd service manager.

# SEE ALSO

[systemctl](/man/systemctl)(1), [machinectl](/man/machinectl)(1), [systemd-nspawn](/man/systemd-nspawn)(1)
