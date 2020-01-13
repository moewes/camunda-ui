package net.moewes.cloud.rest.camunda;

import lombok.Data;

@Data
public class ProcessDefinitionModel {

  private String id;
  private String key;
  private String category;
  private String description;
  private String name;
  private int version;
  private String resource;
  private String deploymentId;
  private String diagram;
  private boolean suspended;
  private String tenantId;
  private String versionTag;
  private Integer historyTimeToLive;
  private boolean isStartableInTasklist;
}
