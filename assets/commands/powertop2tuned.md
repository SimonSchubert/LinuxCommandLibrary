# TAGLINE

Convert PowerTOP suggestions into a TuneD profile

# TLDR

**Generate a new profile** from the current PowerTOP report

```sudo powertop2tuned [my_powersave]```

**Generate a profile from an existing** PowerTOP HTML report

```sudo powertop2tuned -i [/path/to/powertop.html] [my_powersave]```

**Output the profile** into a custom directory

```sudo powertop2tuned -o [/etc/tuned/my_profile] [my_powersave]```

**Create a fresh profile** instead of merging with the active one

```sudo powertop2tuned -n [my_powersave]```

**Merge** PowerTOP recommendations with a **specific** TuneD profile

```sudo powertop2tuned -m [balanced] [my_powersave]```

**Enable all** PowerTOP tunings (skips the safety opt-in)

```sudo powertop2tuned -e [my_powersave]```

**Force-overwrite** an existing profile directory

```sudo powertop2tuned -f [my_powersave]```

# SYNOPSIS

**powertop2tuned** [_options_] _profile_name_

# PARAMETERS

**-i** _FILE_, **--input** _FILE_
> Use _FILE_ as PowerTOP HTML report instead of generating a new one.

**-o** _DIR_, **--output** _DIR_
> Write the generated profile to _DIR_ (default: TuneD's user profile directory).

**-n**, **--new-profile**
> Create a brand-new profile rather than merging with the active TuneD profile.

**-m** _PROFILE_, **--merge-profile** _PROFILE_
> Merge with the named _PROFILE_ instead of the currently active one.

**-f**, **--force**
> Overwrite the output directory if it already exists.

**-e**, **--enable**
> Enable every tuning that PowerTOP suggests. Tunings considered harmful (like **USB_AUTOSUSPEND**) remain disabled.

**-h**, **--help**
> Show usage and exit.

# DESCRIPTION

**powertop2tuned** turns the recommendations produced by **PowerTOP** into a runnable **TuneD** profile, bridging the two tools so that the savings PowerTOP discovers can be applied permanently and rolled back like any other TuneD profile.

The utility runs PowerTOP under the hood (or reads an existing HTML report supplied with **-i**), parses each "Tunable" entry, and emits a profile directory containing a **tuned.conf** file plus a helper shell script. By default the resulting profile inherits from the currently-active TuneD profile so that base optimisations are preserved; **--new-profile** creates a stand-alone profile and **--merge-profile** lets you pick a different parent.

For safety, every PowerTOP recommendation is initially commented out in the generated profile. The administrator is expected to review and uncomment only the lines that are appropriate for the target hardware. The **--enable** flag opts in to enabling all of them, except for ones that the script considers unsafe.

The generated profile is activated like any other TuneD profile with **tuned-adm profile** _profile_name_.

# CAVEATS

PowerTOP's "Bad" tunings can break devices: ALPM and SATA link power management may corrupt some SSDs, USB autosuspend disconnects keyboards/webcams, and Wi-Fi power saving causes connection drops on certain chips. Always test on a non-critical machine and review the generated **tuned.conf** before activating. Requires **root** to run PowerTOP and write to **/etc/tuned/**. Part of the **tuned-utils** package, separate from the core **tuned** package on most distributions.

# CONFIGURATION

Profiles are written to **/etc/tuned/**_profile_name_**/tuned.conf** along with a script.sh helper. Activate with **tuned-adm profile** _profile_name_; switch back with **tuned-adm profile** _balanced_ (or any other profile). The active profile survives reboots once the **tuned.service** systemd unit is enabled.

# HISTORY

**powertop2tuned** ships as part of the Red Hat **TuneD** project, originally introduced to give Fedora and RHEL users a single-step way to commit PowerTOP findings into the TuneD framework. It is distributed via the **tuned-utils** package on Fedora, RHEL, CentOS, openSUSE and Arch.

# SEE ALSO

[powertop](/man/powertop)(8), [tuned](/man/tuned)(8), [tuned-adm](/man/tuned-adm)(8)
