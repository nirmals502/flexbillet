/**
 * flexcheckin
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Organizer {
  
  @SerializedName("localeKey")
  private String localeKey = null;
  @SerializedName("memberShip")
  private Boolean memberShip = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("key")
  private String key = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocaleKey() {
    return localeKey;
  }
  public void setLocaleKey(String localeKey) {
    this.localeKey = localeKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMemberShip() {
    return memberShip;
  }
  public void setMemberShip(Boolean memberShip) {
    this.memberShip = memberShip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organizer organizer = (Organizer) o;
    return (this.localeKey == null ? organizer.localeKey == null : this.localeKey.equals(organizer.localeKey)) &&
        (this.memberShip == null ? organizer.memberShip == null : this.memberShip.equals(organizer.memberShip)) &&
        (this.name == null ? organizer.name == null : this.name.equals(organizer.name)) &&
        (this.key == null ? organizer.key == null : this.key.equals(organizer.key));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.localeKey == null ? 0: this.localeKey.hashCode());
    result = 31 * result + (this.memberShip == null ? 0: this.memberShip.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.key == null ? 0: this.key.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organizer {\n");
    
    sb.append("  localeKey: ").append(localeKey).append("\n");
    sb.append("  memberShip: ").append(memberShip).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}