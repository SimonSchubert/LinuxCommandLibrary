# TLDR

**Run a command** on a Windows host (via pywinrm Python library)

```python -c "import winrm; s = winrm.Session('[host]', auth=('[user]', '[pass]')); print(s.run_cmd('ipconfig').std_out)"```

**Run PowerShell command** on remote Windows host

```python -c "import winrm; s = winrm.Session('[host]', auth=('[user]', '[pass]')); print(s.run_ps('Get-Process').std_out)"```

**Connect using HTTPS** (port 5986)

```python -c "import winrm; s = winrm.Session('[host]', auth=('[user]', '[pass]'), transport='ssl'); print(s.run_cmd('hostname').std_out)"```

**Connect with NTLM authentication**

```python -c "import winrm; s = winrm.Session('[host]', auth=('[domain\\user]', '[pass]'), transport='ntlm'); print(s.run_cmd('whoami').std_out)"```

# SYNOPSIS

**winrm** (via pywinrm Python library)

```python
import winrm
session = winrm.Session(_host_, auth=(_user_, _password_), transport=_method_)
result = session.run_cmd(_command_, [_args_])
result = session.run_ps(_powershell_script_)
```

# PARAMETERS

**host**
> Windows target hostname or IP address.

**auth**
> Tuple of (username, password) for authentication.

**transport**
> Authentication method: basic, ntlm, kerberos, ssl, or credssp.

**run_cmd**(_command_, [_args_])
> Execute a Windows command (cmd.exe).

**run_ps**(_script_)
> Execute a PowerShell script.

**std_out**
> Standard output from command execution.

**std_err**
> Standard error from command execution.

**status_code**
> Exit code of the executed command.

# DESCRIPTION

**pywinrm** is a Python library for Windows Remote Management (WinRM), enabling command execution on Windows machines from Linux or other systems. WinRM is Microsoft's implementation of WS-Management protocol, providing remote management capabilities similar to SSH.

The library supports multiple authentication methods: Basic (requires HTTPS or unencrypted setup), NTLM (works with domain and local accounts), Kerberos (for domain environments), and CredSSP (allows credential delegation). Connection uses HTTP port 5985 or HTTPS port 5986.

pywinrm is extensively used by automation tools like Ansible for Windows management. It can execute both cmd.exe commands (run_cmd) and PowerShell scripts (run_ps), returning output, errors, and exit codes.

Windows hosts must have WinRM enabled (Enable-PSRemoting -Force) and configured to accept the chosen authentication method.

# CAVEATS

WinRM communication is unencrypted over HTTP by default; use HTTPS or NTLM/Kerberos transport for security. Basic authentication requires explicit enabling on Windows hosts. Kerberos requires proper domain configuration and kinit initialization. Firewall rules must allow WinRM ports (5985/5986).

# HISTORY

**WinRM** (Windows Remote Management) was introduced by **Microsoft** in **Windows Vista** and **Server 2008** as part of the WS-Management standard. **pywinrm** was developed to enable WinRM access from Python on non-Windows systems. The library became essential for cross-platform Windows management, particularly gaining prominence through **Ansible's** Windows support starting around **2014**.

# SEE ALSO

[ssh](/man/ssh)(1), [ansible](/man/ansible)(1), [powershell](/man/powershell)(1)
