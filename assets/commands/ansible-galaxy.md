# TLDR

**Install** a role from Galaxy

```ansible-galaxy install [username.role_name]```

Install **collection** from Galaxy

```ansible-galaxy collection install [community.docker]```

Install from **requirements file**

```ansible-galaxy install -r [requirements.yml]```

**List** installed roles

```ansible-galaxy list```

**Initialize** a new role

```ansible-galaxy init [role_name]```

**Search** for roles

```ansible-galaxy search [nginx]```

# SYNOPSIS

**ansible-galaxy** [_role_|_collection_] _command_ [_options_]

# DESCRIPTION

**ansible-galaxy** manages Ansible roles and collections from Ansible Galaxy and other sources. Galaxy is a public repository of community-contributed content, providing reusable automation components.

The tool can install, create, and manage roles (traditional content) and collections (bundled content including modules, plugins, and roles).

# PARAMETERS

**install** _name_
> Install role or collection

**init** _name_
> Create new role scaffold

**list**
> List installed roles/collections

**search** _query_
> Search Galaxy for roles

**remove** _name_
> Remove installed role/collection

**-r** _file_, **--role-file** _file_
> Requirements file

**-p** _path_, **--roles-path** _path_
> Installation path for roles

**--force**
> Force overwrite existing

**-s** _server_, **--server** _server_
> Galaxy server URL

**--offline**
> Work offline (installed content only)

# CAVEATS

Galaxy content is community-maintained; review before use in production. Collection names are namespaced (namespace.collection). Roles and collections have different installation paths.

# HISTORY

**ansible-galaxy** was introduced with Ansible Galaxy in **2013** to share and distribute roles. Collections support was added in Ansible 2.9 (**2019**) as a new content distribution format.

# SEE ALSO

[ansible](/man/ansible)(1), [ansible-playbook](/man/ansible-playbook)(1), [ansible-doc](/man/ansible-doc)(1)
