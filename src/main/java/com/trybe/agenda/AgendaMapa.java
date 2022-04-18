package com.trybe.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaMapa {
  Map<String, String> contatos = new HashMap<String, String>();

  public void incluirContato(String nome, String telefone) {
    contatos.put(nome, telefone);
  }

  public void excluirContato(String nome) {
    contatos.remove(nome);
  }

  public Boolean verificaContato(String nome) {
    return contatos.containsKey(nome);
  }

  public int tamanhoAgenda() {
    return contatos.size();
  }

  public String atualizarTelefone(String nome, String telefone) {
    return contatos.put(nome, telefone);
  }

  public String obterTelefone(String nome) {
    return contatos.get(nome);
  }
}
