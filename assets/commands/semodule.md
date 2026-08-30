# TAGLINE

Manage SELinux policy modules

# TLDR

List the modules in the **active policy**

```sudo semodule --list-modules```

List them with their **priorities and enabled state**

```sudo semodule --list-modules=full```

**Install** a compiled policy module

```sudo semodule --install [path/to/module.pp]```

Install at a **higher priority**, overriding the one the distribution ships

```sudo semodule --priority [400] --install [path/to/module.pp]```

**Disable** a module without removing it

```sudo semodule --disable [module_name]```

**Re-enable** it

```sudo semodule --enable [module_name]```

**Remove** a module

```sudo semodule --remove [module_name]```

Make several changes, then **reload once** at the end

```sudo semodule --noreload --install [path/to/module.pp]```

**Rebuild and reload** the whole policy

```sudo semodule --build```

**Reload** the policy as it stands

```sudo semodule --reload```

Turn off **dontaudit rules**, so silent denials show up in the audit log

```sudo semodule --disable_dontaudit --build```

**Extract** an installed module back out to a file

```sudo semodule --extract [module_name]```

# SYNOPSIS

**semodule** [_options_]

# PARAMETERS

**-l**, **--list**
> List installed modules

**-i**, **--install** _file_
> Install policy module (.pp file)

**-r**, **--remove** _name_
> Remove module

**-e**, **--enable** _name_
> Enable module

**-d**, **--disable** _name_
> Disable module

**-R**, **--reload**
> Force a reload of policy.

**-B**, **--build**
> Force a rebuild of policy (also reloads unless -n is used).

**-X**, **--priority** _PRIORITY_
> Set priority (1-999) for the following operations.

**-s**, **--store** _NAME_
> Name of the store to operate on.

**-n**, **--noreload**
> Do not reload policy after commit.

**-D**, **--disable_dontaudit**
> Temporarily remove dontaudit rules from policy.

**-v**, **--verbose**
> Be verbose.

# DESCRIPTION

**semodule** manages SELinux policy modules. It installs, removes, enables, and disables modular policy components that extend the base SELinux policy.

Policy modules allow customization of SELinux rules without modifying the base policy.

# CAVEATS

Module changes require policy reload. Installing incompatible modules may cause policy errors.

# HISTORY

Part of **policycoreutils**, providing modular SELinux policy management.

# INSTALL

```apt: sudo apt install policycoreutils```

```dnf: sudo dnf install policycoreutils```

```zypper: sudo zypper install policycoreutils```

```nix: nix profile install nixpkgs#policycoreutils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[audit2allow](/man/audit2allow)(1), [semanage](/man/semanage)(8)
