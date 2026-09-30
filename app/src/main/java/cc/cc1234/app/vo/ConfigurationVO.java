package cc.cc1234.app.vo;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ConfigurationVO {

    // 使用 extractor 监听 zkAlias 变化，使依赖备注排序的 SortedList 能在改名后自动重排
    private ObservableList<ServerConfigurationVO> servers =
            FXCollections.observableArrayList(server -> new javafx.beans.Observable[]{server.zkAliasProperty()});

    private SimpleStringProperty theme = new SimpleStringProperty();

    public ObservableList<ServerConfigurationVO> getServers() {
        return servers;
    }

    public void setServers(ObservableList<ServerConfigurationVO> servers) {
        this.servers = servers;
    }

    public String getTheme() {
        return theme.get();
    }

    public SimpleStringProperty themeProperty() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme.set(theme);
    }
}
