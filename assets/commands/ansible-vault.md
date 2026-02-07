# TAGLINE

Encrypt and decrypt sensitive data

# TLDR

**Create** a new encrypted file

```ansible-vault create [secrets.yml]```

**Encrypt** an existing file

```ansible-vault encrypt [file.yml]```

**Decrypt** a file

```ansible-vault decrypt [secrets.yml]```

**Edit** an encrypted file

```ansible-vault edit [secrets.yml]```

**View** encrypted file contents

```ansible-vault view [secrets.yml]```

**Encrypt** a string

```ansible-vault encrypt_string '[secret_value]' --name '[variable_name]'```

**Rekey** (change password)

```ansible-vault rekey [secrets.yml]```

# SYNOPSIS

**ansible-vault** _command_ [_--vault-password-file file_] [_options_] _files_

# DESCRIPTION

**ansible-vault** encrypts sensitive data like passwords, keys, and credentials within Ansible projects. It uses AES256 encryption to protect files while allowing them to be used directly in playbooks.

Encrypted files can be edited, viewed, and used in playbooks without manual decryption; ansible-playbook handles decryption automatically when provided with the vault password.

# PARAMETERS

**create** _file_
> Create new encrypted file

**encrypt** _files_
> Encrypt existing files

**decrypt** _files_
> Decrypt files

**edit** _file_
> Edit encrypted file in place

**view** _file_
> View encrypted file contents

**encrypt_string**
> Encrypt a string for embedding

**rekey** _files_
> Change encryption password

**--vault-password-file** _file_
> File containing vault password

**--vault-id** _label_
> Vault identity label

**--ask-vault-pass**
> Prompt for vault password

**--new-vault-password-file** _file_
> New password file for rekey

# CONFIGURATION

**/etc/ansible/ansible.cfg**
> System-wide Ansible configuration, including vault password file path and vault identity settings.

**~/.ansible.cfg**
> Per-user Ansible configuration overriding system defaults.

**ansible.cfg**
> Project-level configuration in the current directory, highest priority.

# CAVEATS

Vault password must be available during playbook runs. Encrypted files should be committed to version control, not the password. Use vault-id for multiple passwords.

# HISTORY

**ansible-vault** was introduced in Ansible 1.5 (**2014**) to address the need for secure handling of sensitive data in automation. Multiple vault passwords support was added in Ansible 2.4.

# SEE ALSO

[ansible-playbook](/man/ansible-playbook)(1), [ansible](/man/ansible)(1), [gpg](/man/gpg)(1)
